package fullpentecostalchurch.home.blog;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class prayer_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (prayer) ","prayer",12,prayer.mostCurrent.activityBA,prayer.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) return fullpentecostalchurch.home.blog.prayer.remoteMe.runUserSub(false, "prayer","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"facebook\")";
Debug.ShouldStop(67108864);
prayer.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("facebook")),prayer.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="WebView1.LoadUrl(\"https://fullpentecostalchurch.h";
Debug.ShouldStop(134217728);
prayer.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://fullpentecostalchurch.home.blog/prayer-request/")));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (prayer) ","prayer",12,prayer.mostCurrent.activityBA,prayer.mostCurrent,36);
if (RapidSub.canDelegate("activity_pause")) return fullpentecostalchurch.home.blog.prayer.remoteMe.runUserSub(false, "prayer","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Resume (prayer) ","prayer",12,prayer.mostCurrent.activityBA,prayer.mostCurrent,32);
if (RapidSub.canDelegate("activity_resume")) return fullpentecostalchurch.home.blog.prayer.remoteMe.runUserSub(false, "prayer","activity_resume");
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (prayer) ","prayer",12,prayer.mostCurrent.activityBA,prayer.mostCurrent,41);
if (RapidSub.canDelegate("button1_click")) return fullpentecostalchurch.home.blog.prayer.remoteMe.runUserSub(false, "prayer","button1_click");
 BA.debugLineNum = 41;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="StartActivity(main1)";
Debug.ShouldStop(512);
prayer.mostCurrent.__c.runVoidMethod ("StartActivity",prayer.processBA,(Object)((prayer.mostCurrent._main1.getObject())));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Button2_Click (prayer) ","prayer",12,prayer.mostCurrent.activityBA,prayer.mostCurrent,44);
if (RapidSub.canDelegate("button2_click")) return fullpentecostalchurch.home.blog.prayer.remoteMe.runUserSub(false, "prayer","button2_click");
 BA.debugLineNum = 44;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="WebView1.LoadUrl(\"https://fullpentecostalchurch.h";
Debug.ShouldStop(4096);
prayer.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://fullpentecostalchurch.home.blog/prayer-request/")));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (prayer) ","prayer",12,prayer.mostCurrent.activityBA,prayer.mostCurrent,49);
if (RapidSub.canDelegate("button3_click")) return fullpentecostalchurch.home.blog.prayer.remoteMe.runUserSub(false, "prayer","button3_click");
 BA.debugLineNum = 49;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="WebView1.Back";
Debug.ShouldStop(131072);
prayer.mostCurrent._webview1.runVoidMethod ("Back");
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button4_click() throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (prayer) ","prayer",12,prayer.mostCurrent.activityBA,prayer.mostCurrent,53);
if (RapidSub.canDelegate("button4_click")) return fullpentecostalchurch.home.blog.prayer.remoteMe.runUserSub(false, "prayer","button4_click");
 BA.debugLineNum = 53;BA.debugLine="Sub Button4_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="WebView1.Forward";
Debug.ShouldStop(2097152);
prayer.mostCurrent._webview1.runVoidMethod ("Forward");
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
prayer.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Button1 As Button";
prayer.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Button2 As Button";
prayer.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim Urlrefersh As String";
prayer.mostCurrent._urlrefersh = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="Private Button3 As Button";
prayer.mostCurrent._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Button4 As Button";
prayer.mostCurrent._button4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}