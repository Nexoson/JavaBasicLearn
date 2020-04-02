学习Java8 日期时间新特性

Instant：时间戳，相当于java.util的Date
LocalDate：只包含日期，比如：2016-10-20
LocalTime：只包含时间，比如：23:12:10
LocalDateTime：包含日期和时间，比如：2016-10-20 23:14:21
Duration：计算两个“时间”的间隔
Period：用于计算两个“日期”的间隔
ZoneOffset：时区偏移量，比如：+8:00
ZonedDateTime：可以得到特定时区的日期/时间
Clock：时钟，比如获取目前美国纽约的时间


of：静态工厂方法(用类名去调用)。
parse：静态工厂方法，关注于解析(用类名去调用)。
now： 静态工厂方法，用当前时间创建实例(用类名去调用)
get：获取某些东西的值。
is：检查某些东西的是否是true。
with：返回一个部分状态改变了的时间日期对象拷贝(单独一个with方法,参数为TemporalAdjusters类型)。
plus：返回一个时间增加了的、时间日期对象拷贝(如果参数是负数也能够有minus方法的效果)。
minus：返回一个时间减少了的、时间日期对象拷贝。
to：把当前时间日期对象转换成另外一个，可能会损失部分状态。
at：把这个对象与另一个对象组合起来，例如： date.atTime(time)。
format :根据某一个DateTimeFormatter格式化为字符串。


参考博客 https://www.jianshu.com/p/d6e391f12ab3