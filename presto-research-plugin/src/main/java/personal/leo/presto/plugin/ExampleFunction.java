package personal.leo.presto.plugin;

import com.facebook.presto.spi.function.Description;
import com.facebook.presto.spi.function.ScalarFunction;
import com.facebook.presto.spi.function.SqlNullable;
import com.facebook.presto.spi.function.SqlType;
import com.facebook.presto.spi.type.StandardTypes;
import io.airlift.slice.Slice;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2018/1/25 11:11
 * @Description:
 */
public class ExampleFunction {

    @ScalarFunction("is_null")
    @Description("Returns TRUE if the argument is NULL")
    @SqlType(StandardTypes.BOOLEAN)
    public static boolean isNull(@SqlNullable @SqlType(StandardTypes.VARCHAR) Slice string) {
        return (string == null);
    }

}
