# CalendarView
#一个自带农历和节假日的开源日历库
这是一个自带节假日和滑动的日历控件，欢迎各位拍砖##效果图<br>
![](https://github.com/nanchen2251/CalendarView/blob/master/GIF.gif)

####⊙开源不易，希望给个star或者fork奖励
##特点
  1、支持ViewPager形式的左右滑动<br>
  2、支持点击效果<br>
  3、支持农历和周末的颜色显示<br>
##使用方法<br>
  <br>####1、添加依赖<br>
  compile 'com.nanchen.calendarview:calendarview:1.0.7'<br>
  或者<br>
  \<dependency\><br>
  \<groupId>com.nanchen.calendarview\</groupId><br>
  \<artifactId>calendarview\</artifactId><br>
  \<version>1.0.7\</version><br>
  \<type>pom\</type><br>
\</dependency><br>
  <br>####2、在xml文件里面使用<br>
  \<com.nanchen.calendarview.MyCalendarView<br>
        android:layout_width="match_parent"<br>
        android:layout_height="wrap_content"<br>
        android:id="@+id/calendarView"/><br>
  <br>####3、在Activity里面使用<br>
  MyCalendarView calendarView = (MyCalendarView) window.findViewById(R.id.calendarView);<br>
  calendarView.setClickDataListener(new ClickDataListener() {<br>
       @Override<br>
       public void clickData(int year, int month, int day) {<br>
           date = String.format(Locale.CHINA, "%04d-%02d-%02d", year, month, day);<br>
           Toast.showToast(MainActivity.this.getApplicationContext(),date,Toast.LENGTH_SHORT).show();<br>
           }<br>
       });<br>
##关于作者
    南尘<br>
    四川成都<br>
    [博客园](http://www.cnblogs.com/liushilin/)
