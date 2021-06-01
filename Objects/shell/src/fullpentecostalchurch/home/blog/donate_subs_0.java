package fullpentecostalchurch.home.blog;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class donate_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (donate) ","donate",14,donate.mostCurrent.activityBA,donate.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) return fullpentecostalchurch.home.blog.donate.remoteMe.runUserSub(false, "donate","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"facebook\")";
Debug.ShouldStop(67108864);
donate.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("facebook")),donate.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="WebView1.LoadUrl(\"https://fullpentecostalchurch.h";
Debug.ShouldStop(134217728);
donate.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://fullpentecostalchurch.home.blog/donate/")));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Pause (donate) ","donate",14,donate.mostCurrent.activityBA,donate.mostCurrent,35);
if (RapidSub.canDelegate("activity_pause")) return fullpentecostalchurch.home.blog.donate.remoteMe.runUserSub(false, "donate","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Resume (donate) ","donate",14,donate.mostCurrent.activityBA,donate.mostCurrent,31);
if (RapidSub.canDelegate("activity_resume")) return fullpentecostalchurch.home.blog.donate.remoteMe.runUserSub(false, "donate","activity_resume");
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Button1_Click (donate) ","donate",14,donate.mostCurrent.activityBA,donate.mostCurrent,40);
if (RapidSub.canDelegate("button1_click")) return fullpentecostalchurch.home.blog.donate.remoteMe.runUserSub(false, "donate","button1_click");
 BA.debugLineNum = 40;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="StartActivity(main1)";
Debug.ShouldStop(256);
donate.mostCurrent.__c.runVoidMethod ("StartActivity",donate.processBA,(Object)((donate.mostCurrent._main1.getObject())));
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
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (donate) ","donate",14,donate.mostCurrent.activityBA,donate.mostCurrent,47);
if (RapidSub.canDelegate("button2_click")) return fullpentecostalchurch.home.blog.donate.remoteMe.runUserSub(false, "donate","button2_click");
 BA.debugLineNum = 47;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="WebView1.LoadUrl(\"https://fullpentecostalchurch.h";
Debug.ShouldStop(32768);
donate.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://fullpentecostalchurch.home.blog/donate/")));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Button3_Click (donate) ","donate",14,donate.mostCurrent.activityBA,donate.mostCurrent,52);
if (RapidSub.canDelegate("button3_click")) return fullpentecostalchurch.home.blog.donate.remoteMe.runUserSub(false, "donate","button3_click");
 BA.debugLineNum = 52;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="WebView1.Back";
Debug.ShouldStop(1048576);
donate.mostCurrent._webview1.runVoidMethod ("Back");
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Button4_Click (donate) ","donate",14,donate.mostCurrent.activityBA,donate.mostCurrent,56);
if (RapidSub.canDelegate("button4_click")) return fullpentecostalchurch.home.blog.donate.remoteMe.runUserSub(false, "donate","button4_click");
 BA.debugLineNum = 56;BA.debugLine="Sub Button4_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="WebView1.Forward";
Debug.ShouldStop(16777216);
donate.mostCurrent._webview1.runVoidMethod ("Forward");
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
donate.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Button1 As Button";
donate.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim target As String";
donate.mostCurrent._target = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Private Button2 As Button";
donate.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Button3 As Button";
donate.mostCurrent._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Button4 As Button";
donate.mostCurrent._button4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}