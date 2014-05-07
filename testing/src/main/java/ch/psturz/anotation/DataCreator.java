package ch.psturz.anotation;

import java.lang.reflect.Field;
import java.util.List;

public interface DataCreator
{
    public void createDownLoadData(List<DownloadPar> pars, Object o, Field field);
}
