package fullpentecostalchurch.home.blog;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class facebook_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (facebook) ","facebook",7,facebook.mostCurrent.activityBA,facebook.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) return fullpentecostalchurch.home.blog.facebook.remoteMe.runUserSub(false, "facebook","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"facebook\")";
Debug.ShouldStop(67108864);
facebook.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("facebook")),facebook.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="WebView1.LoadUrl(\"https://m.facebook.com/21043563";
Debug.ShouldStop(134217728);
facebook.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://m.facebook.com/2104356313115935/photos/a.2187283571489875/1933349583622340/?type=3&source=44&ref=page_internal")));
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
		Debug.PushSubsStack("Activity_Pause (facebook) ","facebook",7,facebook.mostCurrent.activityBA,facebook.mostCurrent,35);
if (RapidSub.canDelegate("activity_pause")) return fullpentecostalchurch.home.blog.facebook.remoteMe.runUserSub(false, "facebook","activity_pause", _userclosed);
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
		Debug.PushSubsStack("Activity_Resume (facebook) ","facebook",7,facebook.mostCurrent.activityBA,facebook.mostCurrent,31);
if (RapidSub.canDelegate("activity_resume")) return fullpentecostalchurch.home.blog.facebook.remoteMe.runUserSub(false, "facebook","activity_resume");
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
		Debug.PushSubsStack("Button1_Click (facebook) ","facebook",7,facebook.mostCurrent.activityBA,facebook.mostCurrent,40);
if (RapidSub.canDelegate("button1_click")) return fullpentecostalchurch.home.blog.facebook.remoteMe.runUserSub(false, "facebook","button1_click");
 BA.debugLineNum = 40;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="StartActivity(main1)";
Debug.ShouldStop(256);
facebook.mostCurrent.__c.runVoidMethod ("StartActivity",facebook.processBA,(Object)((facebook.mostCurrent._main1.getObject())));
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
		Debug.PushSubsStack("Button2_Click (facebook) ","facebook",7,facebook.mostCurrent.activityBA,facebook.mostCurrent,44);
if (RapidSub.canDelegate("button2_click")) return fullpentecostalchurch.home.blog.facebook.remoteMe.runUserSub(false, "facebook","button2_click");
 BA.debugLineNum = 44;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="WebView1.LoadUrl(\"https://m.facebook.com/21043563";
Debug.ShouldStop(4096);
facebook.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://m.facebook.com/2104356313115935/photos/a.2187283571489875/1933349583622340/?type=3&source=44&ref=page_internal")));
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
		Debug.PushSubsStack("Button3_Click (facebook) ","facebook",7,facebook.mostCurrent.activityBA,facebook.mostCurrent,49);
if (RapidSub.canDelegate("button3_click")) return fullpentecostalchurch.home.blog.facebook.remoteMe.runUserSub(false, "facebook","button3_click");
 BA.debugLineNum = 49;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="WebView1.Back";
Debug.ShouldStop(131072);
facebook.mostCurrent._webview1.runVoidMethod ("Back");
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
		Debug.PushSubsStack("Button4_Click (facebook) ","facebook",7,facebook.mostCurrent.activityBA,facebook.mostCurrent,53);
if (RapidSub.canDelegate("button4_click")) return fullpentecostalchurch.home.blog.facebook.remoteMe.runUserSub(false, "facebook","button4_click");
 BA.debugLineNum = 53;BA.debugLine="Sub Button4_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="WebView1.Forward";
Debug.ShouldStop(2097152);
facebook.mostCurrent._webview1.runVoidMethod ("Forward");
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
facebook.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Button1 As Button";
facebook.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Button2 As Button";
facebook.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim Urlrefersh As String";
facebook.mostCurrent._urlrefersh = RemoteObject.createImmutable("");
 //BA.debugLineNum = 21;BA.debugLine="Private Button3 As Button";
facebook.mostCurrent._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Button4 As Button";
facebook.mostCurrent._button4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}