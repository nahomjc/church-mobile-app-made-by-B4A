package fullpentecostalchurch.home.blog;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class map_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (map) ","map",13,map.mostCurrent.activityBA,map.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) return fullpentecostalchurch.home.blog.map.remoteMe.runUserSub(false, "map","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 24;BA.debugLine="Activity.LoadLayout(\"map\")";
Debug.ShouldStop(8388608);
map.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("map")),map.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="WebView1.LoadUrl(\"https://www.google.com/maps/pla";
Debug.ShouldStop(16777216);
map.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://www.google.com/maps/place/Full+Pentecostal+Church+Ethiopia/@8.9963735,38.7899676,16.88z/data=!4m8!1m2!2m1!1sfull+pentecostal+church+ethiopia!3m4!1s0x164b85e36818ab83:0x8c70c846000360e!8m2!3d8.9966926!4d38.7863504")));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (map) ","map",13,map.mostCurrent.activityBA,map.mostCurrent,32);
if (RapidSub.canDelegate("activity_pause")) return fullpentecostalchurch.home.blog.map.remoteMe.runUserSub(false, "map","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (map) ","map",13,map.mostCurrent.activityBA,map.mostCurrent,28);
if (RapidSub.canDelegate("activity_resume")) return fullpentecostalchurch.home.blog.map.remoteMe.runUserSub(false, "map","activity_resume");
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (map) ","map",13,map.mostCurrent.activityBA,map.mostCurrent,37);
if (RapidSub.canDelegate("button1_click")) return fullpentecostalchurch.home.blog.map.remoteMe.runUserSub(false, "map","button1_click");
 BA.debugLineNum = 37;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="StartActivity(main1)";
Debug.ShouldStop(32);
map.mostCurrent.__c.runVoidMethod ("StartActivity",map.processBA,(Object)((map.mostCurrent._main1.getObject())));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (map) ","map",13,map.mostCurrent.activityBA,map.mostCurrent,40);
if (RapidSub.canDelegate("button2_click")) return fullpentecostalchurch.home.blog.map.remoteMe.runUserSub(false, "map","button2_click");
 BA.debugLineNum = 40;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="WebView1.LoadUrl(Urlrefersh)";
Debug.ShouldStop(256);
map.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(map.mostCurrent._urlrefersh));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private WebView1 As WebView";
map.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Button1 As Button";
map.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim Urlrefersh As String";
map.mostCurrent._urlrefersh = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Private Button2 As Button";
map.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _webview1_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("webview1_pagefinished (map) ","map",13,map.mostCurrent.activityBA,map.mostCurrent,43);
if (RapidSub.canDelegate("webview1_pagefinished")) return fullpentecostalchurch.home.blog.map.remoteMe.runUserSub(false, "map","webview1_pagefinished", _url);
Debug.locals.put("url", _url);
 BA.debugLineNum = 43;BA.debugLine="Sub webview1_pagefinished(url As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Urlrefersh= url";
Debug.ShouldStop(2048);
map.mostCurrent._urlrefersh = _url;
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}