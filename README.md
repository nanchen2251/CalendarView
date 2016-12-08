# CalendarView
#一个自带农历和节假日的开源日历库
这是一个自带节假日和滑动的日历控件，欢迎各位拍砖
##效果图<br>
![](https://github.com/nanchen2251/CalendarView/blob/master/GIF.gif)

####⊙开源不易，希望给个star或者fork奖励
##特点
  1、支持ViewPager形式的左右滑动<br>
  2、支持点击效果<br>
  3、支持农历和周末的颜色显示<br>
##使用方法
####1、添加依赖<br>
```java
  compile 'com.nanchen.calendarview:calendarview:1.0.7'
```
  或者<br>
  ```java
  <dependency\>
  <groupId>com.nanchen.calendarview</groupId>
  <artifactId>calendarview</artifactId>
  <version>1.0.7</version>
  <type>pom</type>
</dependency>
```
####2、在xml文件里面使用<br>
```java
  <com.nanchen.calendarview.MyCalendarView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/calendarView"/>
```
####3、在Activity里面使用<br>
```java
  MyCalendarView calendarView = (MyCalendarView) window.findViewById(R.id.calendarView);
  calendarView.setClickDataListener(new ClickDataListener() {
       @Override
       public void clickData(int year, int month, int day) {
           date = String.format(Locale.CHINA, "%04d-%02d-%02d", year, month, day);
           Toast.showToast(MainActivity.this.getApplicationContext(),date,Toast.LENGTH_SHORT).show();
           }
       });
```
##关于作者
    南尘<br>
    四川成都<br>
    [博客园](http://www.cnblogs.com/liushilin/)
