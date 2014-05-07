package ch.psturz.anotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DownloadDataCreator {
	 /**
     * 
     * @param mode
     * @return 
     */
    public static List<DownloadPar> createData(AbstractMode mode)
    {
        List<Field> fields = new ArrayList<>();
        getAllAnotatedFields(mode.getClass(), fields);
        Collections.sort(fields, (Field field1, Field field2) ->
        {
            return new Integer(field1.getAnnotation(Send.class).order()).compareTo(field2.getAnnotation(Send.class).order());
        });
        return createDownloadPar(fields, mode);
    }
    
    private static List<DownloadPar> createDownloadPar(List<Field> fields,AbstractMode mode)
    {
        List<DownloadPar> pars = new ArrayList<>();
        for (Field field : fields)
        {
            try
            {
                String creatorClassName = field.getAnnotation(Send.class).createData().getName();
                Class<?> outerCreatorClass = Class.forName(creatorClassName.substring(0, creatorClassName.indexOf("$")));  
                Constructor<?> ctor = Class.forName(creatorClassName).getDeclaredConstructor(outerCreatorClass);
                DataCreator creator = (DataCreator)ctor.newInstance(mode);
                creator.createDownLoadData(pars, mode , field);

            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex)
            {
                Logger.getLogger(DownloadDataCreator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchMethodException | SecurityException ex)
            {
                Logger.getLogger(DownloadDataCreator.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalArgumentException | InvocationTargetException ex)
            {
                Logger.getLogger(DownloadDataCreator.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return pars;
    }

    public static void getAllAnotatedFields(Class mode, List<Field> pars)
    {
        if (!mode.getSuperclass().getName().equals(Object.class.getName()))
        {
            getAllAnotatedFields(mode.getSuperclass(), pars);
            getAllFields(mode, pars);

        } else
        {
            getAllFields(mode, pars);
        }
    }

    private static void getAllFields(Class mode, List<Field> fields)
    {
        for (Field field : mode.getDeclaredFields())
        {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Send.class))
            {
                fields.add(field);
            }
        }
    }


}
