## log4j 

### Prerequisites
- JDK (I am using Java 1.8)
- Maven (I am using Maven 3.6.3)

### Understanding log levels

Log levels are used to control the verbosity of logs. There are 6 log levels in log4j. They are:

- FATAL
- ERROR
- WARN
- INFO
- DEBUG
- TRACE

Convenient constants are available in `org.apache.log4j.Level` class.
- OFF
- ALL

> **Note:** TRACE < DEBUG < INFO < WARN < ERROR < FATAL

For example: 
If you enable TRACE, all the logs will be printed. If you enable DEBUG, all the logs except TRACE will be printed and so on.

### Understanding Appenders

Appenders are used to print the logs to the console, file, database, etc. There are different types of appenders available in log4j. 
Some of the appenders are:

- ConsoleAppender: logs to the console
- FileAppender: captures logs in the specified file
- RollingFileAppender: captures logs in the specified file and rolls over the file when the file size reaches a certain limit
- DailyRollingFileAppender: captures logs in the specified file and rolls over the file on a daily basis
- JDBCAppender: logs to the database
- SMTPAppender: sends logs via email

You can also create your own custom appender by extending `org.apache.log4j.AppenderSkeleton` class.


Very Good Reference: https://betterstack.com/community/guides/logging/how-to-start-logging-with-log4j/
