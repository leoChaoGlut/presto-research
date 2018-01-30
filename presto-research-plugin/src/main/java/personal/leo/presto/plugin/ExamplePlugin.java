package personal.leo.presto.plugin;

import com.facebook.presto.spi.Plugin;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2018/1/25 11:09
 * @Description:
 */
public class ExamplePlugin implements Plugin {
    @Override
    public Set<Class<?>> getFunctions() {
        return new HashSet<Class<?>>() {
            {
                add(ExampleFunction.class);
            }
        };
    }
}
