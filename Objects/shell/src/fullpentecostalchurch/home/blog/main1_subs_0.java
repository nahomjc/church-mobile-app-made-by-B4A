package fullpentecostalchurch.home.blog;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main1_subs_0 {


public static RemoteObject  _abpop_closed() throws Exception{
try {
		Debug.PushSubsStack("ABPop_Closed (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,164);
if (RapidSub.canDelegate("abpop_closed")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","abpop_closed");
 BA.debugLineNum = 164;BA.debugLine="Sub ABPop_Closed";
Debug.ShouldStop(8);
 BA.debugLineNum = 165;BA.debugLine="dummy.RemoveView";
Debug.ShouldStop(16);
main1.mostCurrent._dummy.runVoidMethod ("RemoveView");
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _abpop_itemclicked(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("ABPop_ItemClicked (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,168);
if (RapidSub.canDelegate("abpop_itemclicked")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","abpop_itemclicked", _item);
Debug.locals.put("Item", _item);
 BA.debugLineNum = 168;BA.debugLine="Sub ABPop_ItemClicked (Item As MenuItem)";
Debug.ShouldStop(128);
 BA.debugLineNum = 170;BA.debugLine="PopupMenu_ItemClicked(Item)";
Debug.ShouldStop(512);
_popupmenu_itemclicked(_item);
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 44;BA.debugLine="Activity.LoadLayout(\"Main\")";
Debug.ShouldStop(2048);
main1.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Main")),main1.mostCurrent.activityBA);
 BA.debugLineNum = 46;BA.debugLine="Activity.Title = \"Full Pentecostal Church\"";
Debug.ShouldStop(8192);
main1.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence("Full Pentecostal Church"));
 BA.debugLineNum = 48;BA.debugLine="ListView1.Visible=False";
Debug.ShouldStop(32768);
main1.mostCurrent._listview1.runMethod(true,"setVisible",main1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 49;BA.debugLine="ListView1.AddSingleLine(\" help\")";
Debug.ShouldStop(65536);
main1.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(" help"))));
 BA.debugLineNum = 50;BA.debugLine="ListView1.AddSingleLine(\" help\")";
Debug.ShouldStop(131072);
main1.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(" help"))));
 BA.debugLineNum = 51;BA.debugLine="ListView1.AddSingleLine(\" help\")";
Debug.ShouldStop(262144);
main1.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(" help"))));
 BA.debugLineNum = 52;BA.debugLine="ListView1.SingleLineLayout.Label.Text=Colors.RGB(";
Debug.ShouldStop(524288);
main1.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setText",BA.ObjectToCharSequence(main1.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 38)),(Object)(BA.numberCast(int.class, 50)),(Object)(BA.numberCast(int.class, 56)))));
 BA.debugLineNum = 53;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize=14";
Debug.ShouldStop(1048576);
main1.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 54;BA.debugLine="ListView1.SingleLineLayout.ItemHeight=35dip";
Debug.ShouldStop(2097152);
main1.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").runMethod(true,"setItemHeight",main1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35))));
 BA.debugLineNum = 55;BA.debugLine="listsiz.Initialize(\"\")";
Debug.ShouldStop(4194304);
main1.mostCurrent._listsiz.runVoidMethod ("Initialize",main1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 56;BA.debugLine="listsiz.SetLayout(ListView1.Left,ListView1.Top,Li";
Debug.ShouldStop(8388608);
main1.mostCurrent._listsiz.runVoidMethod ("SetLayout",(Object)(main1.mostCurrent._listview1.runMethod(true,"getLeft")),(Object)(main1.mostCurrent._listview1.runMethod(true,"getTop")),(Object)(main1.mostCurrent._listview1.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {main1.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").runMethod(true,"getItemHeight"),RemoteObject.createImmutable(4)}, "*",0, 1)));
 BA.debugLineNum = 58;BA.debugLine="ListView1.SetLayout(100%x,0%y,0dip,0dip)";
Debug.ShouldStop(33554432);
main1.mostCurrent._listview1.runVoidMethod ("SetLayout",(Object)(main1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main1.mostCurrent.activityBA)),(Object)(main1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),main1.mostCurrent.activityBA)),(Object)(main1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(main1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 59;BA.debugLine="Activity.AddMenuItem3(\"📚\", \"Menu\", Null, True)";
Debug.ShouldStop(67108864);
main1.mostCurrent._activity.runVoidMethod ("AddMenuItem3",(Object)(BA.ObjectToCharSequence("📚")),(Object)(BA.ObjectToString("Menu")),(Object)((main1.mostCurrent.__c.getField(false,"Null"))),(Object)(main1.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 61;BA.debugLine="menu.Initialize(Activity,Me, \"ArcMenu\",LoadBitmap";
Debug.ShouldStop(268435456);
main1.mostCurrent._menu.runClassMethod (fullpentecostalchurch.home.blog.arcmenu.class, "_initialize",main1.mostCurrent.activityBA,(Object)(main1.mostCurrent._activity),(Object)(main1.getObject()),(Object)(BA.ObjectToString("ArcMenu")),(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("plus11.png")))),(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("menu23.png")))),(Object)(main1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),main1.mostCurrent.activityBA)),(Object)(main1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 93)),main1.mostCurrent.activityBA)));
 BA.debugLineNum = 63;BA.debugLine="menu.SetDegreeSpan(90)";
Debug.ShouldStop(1073741824);
main1.mostCurrent._menu.runClassMethod (fullpentecostalchurch.home.blog.arcmenu.class, "_setdegreespan",(Object)(BA.numberCast(int.class, 90)));
 BA.debugLineNum = 64;BA.debugLine="menu.SetMenuItemRadius(40%x)";
Debug.ShouldStop(-2147483648);
main1.mostCurrent._menu.runClassMethod (fullpentecostalchurch.home.blog.arcmenu.class, "_setmenuitemradius",(Object)(main1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),main1.mostCurrent.activityBA)));
 BA.debugLineNum = 65;BA.debugLine="menu.AddItem(LoadBitmap(File.DirAssets, \"circle-c";
Debug.ShouldStop(1);
main1.mostCurrent._menu.runClassMethod (fullpentecostalchurch.home.blog.arcmenu.class, "_additem",(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("circle-cropped(9).png")))));
 BA.debugLineNum = 66;BA.debugLine="menu.AddItem(LoadBitmap(File.DirAssets, \"circle-c";
Debug.ShouldStop(2);
main1.mostCurrent._menu.runClassMethod (fullpentecostalchurch.home.blog.arcmenu.class, "_additem",(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("circle-cropped(6).png")))));
 BA.debugLineNum = 67;BA.debugLine="menu.AddItem(LoadBitmap(File.DirAssets, \"circle-c";
Debug.ShouldStop(4);
main1.mostCurrent._menu.runClassMethod (fullpentecostalchurch.home.blog.arcmenu.class, "_additem",(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("circle-cropped(5).png")))));
 BA.debugLineNum = 68;BA.debugLine="menu.AddItem(LoadBitmap(File.DirAssets, \"not1.png";
Debug.ShouldStop(8);
main1.mostCurrent._menu.runClassMethod (fullpentecostalchurch.home.blog.arcmenu.class, "_additem",(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("not1.png")))));
 BA.debugLineNum = 71;BA.debugLine="menu2.Initialize(Activity,Me, \"ArcMenu2\",LoadBitm";
Debug.ShouldStop(64);
main1.mostCurrent._menu2.runClassMethod (fullpentecostalchurch.home.blog.arcmenu2.class, "_initialize",main1.mostCurrent.activityBA,(Object)(main1.mostCurrent._activity),(Object)(main1.getObject()),(Object)(BA.ObjectToString("ArcMenu2")),(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("circle-cropped(2).png")))),(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("menu23.png")))),(Object)(main1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),main1.mostCurrent.activityBA)),(Object)(main1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 12)),main1.mostCurrent.activityBA)));
 BA.debugLineNum = 73;BA.debugLine="menu2.SetDegreeSpan(180)";
Debug.ShouldStop(256);
main1.mostCurrent._menu2.runClassMethod (fullpentecostalchurch.home.blog.arcmenu2.class, "_setdegreespan",(Object)(BA.numberCast(int.class, 180)));
 BA.debugLineNum = 74;BA.debugLine="menu2.SetMenuItemRadius(30%x)";
Debug.ShouldStop(512);
main1.mostCurrent._menu2.runClassMethod (fullpentecostalchurch.home.blog.arcmenu2.class, "_setmenuitemradius",(Object)(main1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),main1.mostCurrent.activityBA)));
 BA.debugLineNum = 75;BA.debugLine="menu2.AddItem(LoadBitmap(File.DirAssets, \"circle-";
Debug.ShouldStop(1024);
main1.mostCurrent._menu2.runClassMethod (fullpentecostalchurch.home.blog.arcmenu2.class, "_additem",(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("circle-cropped(17).png")))));
 BA.debugLineNum = 76;BA.debugLine="menu2.AddItem(LoadBitmap(File.DirAssets, \"circle-";
Debug.ShouldStop(2048);
main1.mostCurrent._menu2.runClassMethod (fullpentecostalchurch.home.blog.arcmenu2.class, "_additem",(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("circle-cropped(17).png")))));
 BA.debugLineNum = 77;BA.debugLine="sm.Initialize(Activity, Me, \"SlideMenu\", 48dip, 2";
Debug.ShouldStop(4096);
main1.mostCurrent._sm.runClassMethod (fullpentecostalchurch.home.blog.slidemenu.class, "_initialize",main1.mostCurrent.activityBA,(Object)(main1.mostCurrent._activity),(Object)(main1.getObject()),(Object)(BA.ObjectToString("SlideMenu")),(Object)(main1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 48)))),(Object)(main1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 230)))));
 BA.debugLineNum = 78;BA.debugLine="sm.AddItem(\" Home\", LoadBitmap(File.DirAssets, \"c";
Debug.ShouldStop(8192);
main1.mostCurrent._sm.runClassMethod (fullpentecostalchurch.home.blog.slidemenu.class, "_additem",(Object)(BA.ObjectToString(" Home")),(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("circle-cropped(7).png")))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 79;BA.debugLine="sm.AddItem(\"Donation\", LoadBitmap(File.DirAssets,";
Debug.ShouldStop(16384);
main1.mostCurrent._sm.runClassMethod (fullpentecostalchurch.home.blog.slidemenu.class, "_additem",(Object)(BA.ObjectToString("Donation")),(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("donation-22-153879.png")))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 80;BA.debugLine="sm.AddItem(\"What is new\", LoadBitmap(File.DirAsse";
Debug.ShouldStop(32768);
main1.mostCurrent._sm.runClassMethod (fullpentecostalchurch.home.blog.slidemenu.class, "_additem",(Object)(BA.ObjectToString("What is new")),(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("circle-cropped(12).png")))),(Object)(RemoteObject.createImmutable((3))));
 BA.debugLineNum = 81;BA.debugLine="sm.AddItem(\"Mission\", LoadBitmap(File.DirAssets,";
Debug.ShouldStop(65536);
main1.mostCurrent._sm.runClassMethod (fullpentecostalchurch.home.blog.slidemenu.class, "_additem",(Object)(BA.ObjectToString("Mission")),(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("circle-cropped(11).png")))),(Object)(RemoteObject.createImmutable((4))));
 BA.debugLineNum = 82;BA.debugLine="sm.AddItem(\"Map\", LoadBitmap(File.DirAssets, \"49-";
Debug.ShouldStop(131072);
main1.mostCurrent._sm.runClassMethod (fullpentecostalchurch.home.blog.slidemenu.class, "_additem",(Object)(BA.ObjectToString("Map")),(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("49-512-1.png")))),(Object)(RemoteObject.createImmutable((5))));
 BA.debugLineNum = 83;BA.debugLine="sm.AddItem(\"\", LoadBitmap(File.DirAssets, \"transp";
Debug.ShouldStop(262144);
main1.mostCurrent._sm.runClassMethod (fullpentecostalchurch.home.blog.slidemenu.class, "_additem",(Object)(BA.ObjectToString("")),(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("transparent.png")))),(Object)(RemoteObject.createImmutable((6))));
 BA.debugLineNum = 84;BA.debugLine="sm.AddItem(\"Exit\", LoadBitmap(File.DirAssets, \"15";
Debug.ShouldStop(524288);
main1.mostCurrent._sm.runClassMethod (fullpentecostalchurch.home.blog.slidemenu.class, "_additem",(Object)(BA.ObjectToString("Exit")),(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("1531801_1.jpg")))),(Object)(RemoteObject.createImmutable((7))));
 BA.debugLineNum = 101;BA.debugLine="Spotlightmenu.Initialize(Me,\"Spotlightmenu\",5%y,F";
Debug.ShouldStop(16);
main1.mostCurrent._spotlightmenu.runVoidMethod ("_initialize",main1.mostCurrent.activityBA,(Object)(main1.getObject()),(Object)(BA.ObjectToString("Spotlightmenu")),(Object)(BA.numberCast(float.class, main1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),main1.mostCurrent.activityBA))),(Object)(main1.mostCurrent.__c.getField(true,"False")),(Object)(main1.mostCurrent.__c.getField(true,"False")),(Object)(main1.mostCurrent.__c.getField(true,"True")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), main1.mostCurrent._buttoninfo.getObject()),(Object)(main1.mostCurrent._activity));
 BA.debugLineNum = 103;BA.debugLine="Spotlightmenu.additem(\"Prayer request\",Colors.Bla";
Debug.ShouldStop(64);
main1.mostCurrent._spotlightmenu.runVoidMethod ("_additem",(Object)(BA.ObjectToString("Prayer request")),(Object)(main1.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.numberCast(int.class, 15)),(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("circle-cropped(14).png")))));
 BA.debugLineNum = 104;BA.debugLine="Spotlightmenu.additem(\"Email us\",Colors.Black,15,";
Debug.ShouldStop(128);
main1.mostCurrent._spotlightmenu.runVoidMethod ("_additem",(Object)(BA.ObjectToString("Email us")),(Object)(main1.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.numberCast(int.class, 15)),(Object)(main1.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main1.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("circle-cropped(8).png")))));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,262);
if (RapidSub.canDelegate("activity_keypress")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","activity_keypress", _keycode);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 262;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(32);
 BA.debugLineNum = 264;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK And sm.isVisib";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, main1.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK"))) && RemoteObject.solveBoolean(".",main1.mostCurrent._sm.runClassMethod (fullpentecostalchurch.home.blog.slidemenu.class, "_isvisible"))) { 
 BA.debugLineNum = 265;BA.debugLine="sm.Hide";
Debug.ShouldStop(256);
main1.mostCurrent._sm.runClassMethod (fullpentecostalchurch.home.blog.slidemenu.class, "_hide");
 BA.debugLineNum = 266;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) return main1.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 270;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_MENU Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, main1.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_MENU")))) { 
 BA.debugLineNum = 271;BA.debugLine="If sm.isVisible Then sm.Hide Else sm.Show";
Debug.ShouldStop(16384);
if (main1.mostCurrent._sm.runClassMethod (fullpentecostalchurch.home.blog.slidemenu.class, "_isvisible").<Boolean>get().booleanValue()) { 
main1.mostCurrent._sm.runClassMethod (fullpentecostalchurch.home.blog.slidemenu.class, "_hide");}
else {
main1.mostCurrent._sm.runClassMethod (fullpentecostalchurch.home.blog.slidemenu.class, "_show");};
 BA.debugLineNum = 272;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) return main1.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 274;BA.debugLine="If ListView1.Visible=True Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",main1.mostCurrent._listview1.runMethod(true,"getVisible"),main1.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 275;BA.debugLine="ListView1.SetLayout(100%x,0%y,0dip,0dip)";
Debug.ShouldStop(262144);
main1.mostCurrent._listview1.runVoidMethod ("SetLayout",(Object)(main1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main1.mostCurrent.activityBA)),(Object)(main1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),main1.mostCurrent.activityBA)),(Object)(main1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(main1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 276;BA.debugLine="ListView1.Visible=False";
Debug.ShouldStop(524288);
main1.mostCurrent._listview1.runMethod(true,"setVisible",main1.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 279;BA.debugLine="Return True";
Debug.ShouldStop(4194304);
if (true) return main1.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,254);
if (RapidSub.canDelegate("activity_pause")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 254;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_Resume (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,250);
if (RapidSub.canDelegate("activity_resume")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","activity_resume");
 BA.debugLineNum = 250;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _arcmenu_animationend(RemoteObject _open) throws Exception{
try {
		Debug.PushSubsStack("ArcMenu_AnimationEnd (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,247);
if (RapidSub.canDelegate("arcmenu_animationend")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","arcmenu_animationend", _open);
Debug.locals.put("Open", _open);
 BA.debugLineNum = 247;BA.debugLine="Sub ArcMenu_AnimationEnd(Open As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _arcmenu_click(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ArcMenu_Click (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,180);
if (RapidSub.canDelegate("arcmenu_click")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","arcmenu_click", _position);
Debug.locals.put("position", _position);
 BA.debugLineNum = 180;BA.debugLine="Sub ArcMenu_Click(position As Int)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 182;BA.debugLine="Select position";
Debug.ShouldStop(2097152);
switch (BA.switchObjectToInt(_position,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4))) {
case 0: {
 BA.debugLineNum = 185;BA.debugLine="StartActivity(chat)";
Debug.ShouldStop(16777216);
main1.mostCurrent.__c.runVoidMethod ("StartActivity",main1.processBA,(Object)((main1.mostCurrent._chat.getObject())));
 break; }
case 1: {
 BA.debugLineNum = 188;BA.debugLine="StartActivity(facebook)";
Debug.ShouldStop(134217728);
main1.mostCurrent.__c.runVoidMethod ("StartActivity",main1.processBA,(Object)((main1.mostCurrent._facebook.getObject())));
 break; }
case 2: {
 BA.debugLineNum = 190;BA.debugLine="StartActivity(youtube)";
Debug.ShouldStop(536870912);
main1.mostCurrent.__c.runVoidMethod ("StartActivity",main1.processBA,(Object)((main1.mostCurrent._youtube.getObject())));
 break; }
case 3: {
 BA.debugLineNum = 192;BA.debugLine="StartActivity(note)";
Debug.ShouldStop(-2147483648);
main1.mostCurrent.__c.runVoidMethod ("StartActivity",main1.processBA,(Object)((main1.mostCurrent._note.getObject())));
 break; }
}
;
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _arcmenu_longclick(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ArcMenu_LongClick (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,242);
if (RapidSub.canDelegate("arcmenu_longclick")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","arcmenu_longclick", _position);
Debug.locals.put("position", _position);
 BA.debugLineNum = 242;BA.debugLine="Sub ArcMenu_LongClick(position As Int)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 243;BA.debugLine="ToastMessageShow(\"Item \" & position & \" LongClick";
Debug.ShouldStop(262144);
main1.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Item "),_position,RemoteObject.createImmutable(" LongClicked")))),(Object)(main1.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _arcmenu2_click(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ArcMenu2_Click (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,197);
if (RapidSub.canDelegate("arcmenu2_click")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","arcmenu2_click", _position);
Debug.locals.put("position", _position);
 BA.debugLineNum = 197;BA.debugLine="Sub ArcMenu2_Click(position As Int)";
Debug.ShouldStop(16);
 BA.debugLineNum = 199;BA.debugLine="Select position";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(_position,BA.numberCast(int.class, 0))) {
case 0: {
 BA.debugLineNum = 201;BA.debugLine="ToastMessageShow(\"help\",False)";
Debug.ShouldStop(256);
main1.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("help")),(Object)(main1.mostCurrent.__c.getField(true,"False")));
 break; }
}
;
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshow_click() throws Exception{
try {
		Debug.PushSubsStack("btnShow_Click (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,282);
if (RapidSub.canDelegate("btnshow_click")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","btnshow_click");
 BA.debugLineNum = 282;BA.debugLine="Sub btnShow_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 283;BA.debugLine="sm.Show";
Debug.ShouldStop(67108864);
main1.mostCurrent._sm.runClassMethod (fullpentecostalchurch.home.blog.slidemenu.class, "_show");
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Button2_Click (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,114);
if (RapidSub.canDelegate("button2_click")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","button2_click");
RemoteObject _pop = RemoteObject.declareNull("de.amberhome.actionbarhelper.PopupMenuWrapper");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
int _i = 0;
 BA.debugLineNum = 114;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="Dim pop As PopupMenu";
Debug.ShouldStop(262144);
_pop = RemoteObject.createNew ("de.amberhome.actionbarhelper.PopupMenuWrapper");Debug.locals.put("pop", _pop);
 BA.debugLineNum = 116;BA.debugLine="Dim v As View";
Debug.ShouldStop(524288);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("v", _v);
 BA.debugLineNum = 118;BA.debugLine="v = Sender";
Debug.ShouldStop(2097152);
_v.setObject(main1.mostCurrent.__c.runMethod(false,"Sender",main1.mostCurrent.activityBA));
 BA.debugLineNum = 120;BA.debugLine="pop.Initialize(\"PopupMenu\", v)";
Debug.ShouldStop(8388608);
_pop.runVoidMethod ("Initialize",main1.mostCurrent.activityBA,(Object)(BA.ObjectToString("PopupMenu")),(Object)((_v.getObject())));
 BA.debugLineNum = 122;BA.debugLine="For i = 0 To 9";
Debug.ShouldStop(33554432);
{
final int step5 = 1;
final int limit5 = 9;
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 123;BA.debugLine="pop.AddMenuItem(i, \"MenuItem \" & i, GetDrawable(";
Debug.ShouldStop(67108864);
_pop.runVoidMethod ("AddMenuItem",(Object)(BA.numberCast(int.class, _i)),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("MenuItem "),RemoteObject.createImmutable(_i)))),(Object)((_getdrawable(RemoteObject.createImmutable("ic_action_edit")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 126;BA.debugLine="pop.Show";
Debug.ShouldStop(536870912);
_pop.runVoidMethod ("Show");
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Button3_Click (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,294);
if (RapidSub.canDelegate("button3_click")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","button3_click");
 BA.debugLineNum = 294;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 295;BA.debugLine="ListView1.Visible=True";
Debug.ShouldStop(64);
main1.mostCurrent._listview1.runMethod(true,"setVisible",main1.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 296;BA.debugLine="ListView1.BringToFront";
Debug.ShouldStop(128);
main1.mostCurrent._listview1.runVoidMethod ("BringToFront");
 BA.debugLineNum = 297;BA.debugLine="ListView1.SetLayoutAnimated(250,ListView1.Left,Li";
Debug.ShouldStop(256);
main1.mostCurrent._listview1.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(main1.mostCurrent._listview1.runMethod(true,"getLeft")),(Object)(main1.mostCurrent._listview1.runMethod(true,"getTop")),(Object)(main1.mostCurrent._listview1.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {main1.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").runMethod(true,"getItemHeight"),RemoteObject.createImmutable(4)}, "*",0, 1)));
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttoninfo_click() throws Exception{
try {
		Debug.PushSubsStack("Buttoninfo_Click (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,259);
if (RapidSub.canDelegate("buttoninfo_click")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","buttoninfo_click");
 BA.debugLineNum = 259;BA.debugLine="Sub Buttoninfo_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 260;BA.debugLine="Spotlightmenu.show";
Debug.ShouldStop(8);
main1.mostCurrent._spotlightmenu.runVoidMethod ("_show");
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _exitbutton_click() throws Exception{
try {
		Debug.PushSubsStack("ExitButton_Click (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,307);
if (RapidSub.canDelegate("exitbutton_click")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","exitbutton_click");
 BA.debugLineNum = 307;BA.debugLine="Sub ExitButton_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 310;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
main1.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdrawable(RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("GetDrawable (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,135);
if (RapidSub.canDelegate("getdrawable")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","getdrawable", _name);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable(0);
Debug.locals.put("Name", _name);
 BA.debugLineNum = 135;BA.debugLine="Sub GetDrawable(Name As String) As Object";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(128);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 137;BA.debugLine="Dim package As String";
Debug.ShouldStop(256);
_package = RemoteObject.createImmutable("");Debug.locals.put("package", _package);
 BA.debugLineNum = 138;BA.debugLine="Dim id As Int";
Debug.ShouldStop(512);
_id = RemoteObject.createImmutable(0);Debug.locals.put("id", _id);
 BA.debugLineNum = 139;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
Debug.ShouldStop(1024);
_package = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("package", _package);
 BA.debugLineNum = 140;BA.debugLine="id = r.GetStaticField(package & \".R$drawable\", Na";
Debug.ShouldStop(2048);
_id = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$drawable"))),(Object)(_name)));Debug.locals.put("id", _id);
 BA.debugLineNum = 141;BA.debugLine="r.Target = r.GetContext";
Debug.ShouldStop(4096);
_r.setField ("Target",(_r.runMethod(false,"GetContext",main1.processBA)));
 BA.debugLineNum = 142;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
Debug.ShouldStop(8192);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getResources"))));
 BA.debugLineNum = 143;BA.debugLine="Return r.RunMethod2(\"getDrawable\", id, \"java.lang";
Debug.ShouldStop(16384);
if (true) return _r.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("getDrawable")),(Object)(BA.NumberToString(_id)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private ImageView1 As ImageView";
main1.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim dummy As Panel";
main1.mostCurrent._dummy = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim menu As ArcMenu";
main1.mostCurrent._menu = RemoteObject.createNew ("fullpentecostalchurch.home.blog.arcmenu");
 //BA.debugLineNum = 21;BA.debugLine="Dim menu2 As ArcMenu2";
main1.mostCurrent._menu2 = RemoteObject.createNew ("fullpentecostalchurch.home.blog.arcmenu2");
 //BA.debugLineNum = 22;BA.debugLine="Private Buttoninfo As Button";
main1.mostCurrent._buttoninfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim sm As SlideMenu";
main1.mostCurrent._sm = RemoteObject.createNew ("fullpentecostalchurch.home.blog.slidemenu");
 //BA.debugLineNum = 24;BA.debugLine="Private Spotlightmenu As SpotLight";
main1.mostCurrent._spotlightmenu = RemoteObject.createNew ("b4a.example.spotlight");
 //BA.debugLineNum = 25;BA.debugLine="Private FPC As Button";
main1.mostCurrent._fpc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Button2 As Button";
main1.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Button1 As Button";
main1.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim listsiz As ListView";
main1.mostCurrent._listsiz = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim ComServ As String";
main1.mostCurrent._comserv = RemoteObject.createImmutable("");
 //BA.debugLineNum = 31;BA.debugLine="Dim WebView1 As WebView";
main1.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private ListView1 As ListView";
main1.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _image1_click() throws Exception{
try {
		Debug.PushSubsStack("Image1_Click (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,290);
if (RapidSub.canDelegate("image1_click")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","image1_click");
 BA.debugLineNum = 290;BA.debugLine="Sub Image1_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listview1_closed() throws Exception{
try {
		Debug.PushSubsStack("listview1_Closed (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,299);
if (RapidSub.canDelegate("listview1_closed")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","listview1_closed");
 BA.debugLineNum = 299;BA.debugLine="Sub listview1_Closed";
Debug.ShouldStop(1024);
 BA.debugLineNum = 300;BA.debugLine="ListView1.SetLayout(100%x,0%y,0dip,0dip)";
Debug.ShouldStop(2048);
main1.mostCurrent._listview1.runVoidMethod ("SetLayout",(Object)(main1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main1.mostCurrent.activityBA)),(Object)(main1.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),main1.mostCurrent.activityBA)),(Object)(main1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(main1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 301;BA.debugLine="ListView1.Visible=False";
Debug.ShouldStop(4096);
main1.mostCurrent._listview1.runMethod(true,"setVisible",main1.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menu_click() throws Exception{
try {
		Debug.PushSubsStack("Menu_Click (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,146);
if (RapidSub.canDelegate("menu_click")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","menu_click");
RemoteObject _pop = RemoteObject.declareNull("de.amberhome.actionbarhelper.PopupMenuWrapper");
int _i = 0;
 BA.debugLineNum = 146;BA.debugLine="Sub Menu_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="Log(\"Show popup\")";
Debug.ShouldStop(262144);
main1.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Show popup")));
 BA.debugLineNum = 150;BA.debugLine="dummy.Initialize(\"\")";
Debug.ShouldStop(2097152);
main1.mostCurrent._dummy.runVoidMethod ("Initialize",main1.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 151;BA.debugLine="Activity.AddView(dummy, 80%x, 0, 1dip, 1dip)";
Debug.ShouldStop(4194304);
main1.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main1.mostCurrent._dummy.getObject())),(Object)(main1.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),main1.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(main1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(main1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 152;BA.debugLine="dummy.Color = Colors.Transparent";
Debug.ShouldStop(8388608);
main1.mostCurrent._dummy.runVoidMethod ("setColor",main1.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 155;BA.debugLine="Dim pop As PopupMenu";
Debug.ShouldStop(67108864);
_pop = RemoteObject.createNew ("de.amberhome.actionbarhelper.PopupMenuWrapper");Debug.locals.put("pop", _pop);
 BA.debugLineNum = 156;BA.debugLine="pop.Initialize(\"ABPop\", dummy)";
Debug.ShouldStop(134217728);
_pop.runVoidMethod ("Initialize",main1.mostCurrent.activityBA,(Object)(BA.ObjectToString("ABPop")),(Object)((main1.mostCurrent._dummy.getObject())));
 BA.debugLineNum = 158;BA.debugLine="For i = 0 To 0";
Debug.ShouldStop(536870912);
{
final int step7 = 1;
final int limit7 = 0;
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 159;BA.debugLine="pop.AddMenuItem(i, \"About us \" , GetDrawable(\"a_";
Debug.ShouldStop(1073741824);
_pop.runVoidMethod ("AddMenuItem",(Object)(BA.numberCast(int.class, _i)),(Object)(BA.ObjectToCharSequence("About us ")),(Object)((_getdrawable(RemoteObject.createImmutable("a_b_c")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 162;BA.debugLine="pop.Show";
Debug.ShouldStop(2);
_pop.runVoidMethod ("Show");
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _popupmenu_closed() throws Exception{
try {
		Debug.PushSubsStack("PopupMenu_Closed (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,132);
if (RapidSub.canDelegate("popupmenu_closed")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","popupmenu_closed");
 BA.debugLineNum = 132;BA.debugLine="Sub PopupMenu_Closed";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="Log(\"PopupMenu closed\")";
Debug.ShouldStop(16);
main1.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("PopupMenu closed")));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _popupmenu_itemclicked(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("PopupMenu_ItemClicked (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,128);
if (RapidSub.canDelegate("popupmenu_itemclicked")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","popupmenu_itemclicked", _item);
Debug.locals.put("Item", _item);
 BA.debugLineNum = 128;BA.debugLine="Sub PopupMenu_ItemClicked (Item As MenuItem)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="MsgboxAsync(\"📱Version 1.0";
Debug.ShouldStop(1);
main1.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("📱Version 1.0                                   🛂Developed by Nahom Tesfaye                                  📞For More Info Call 0960148453                                                        ⛪Full Pentecostal church app is all about helping Children's of GOD to have deep relationship with Jesus and Assisting Christian's to Grow in the knowledge of Christ🙏")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("About us👨"))),main1.processBA);
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _slidemenu_click(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("SlideMenu_Click (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,222);
if (RapidSub.canDelegate("slidemenu_click")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","slidemenu_click", _item);
Debug.locals.put("Item", _item);
 BA.debugLineNum = 222;BA.debugLine="Sub SlideMenu_Click(Item As Object)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 223;BA.debugLine="Select Item";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(_item,RemoteObject.createImmutable((1)),RemoteObject.createImmutable((2)),RemoteObject.createImmutable((3)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((5)),RemoteObject.createImmutable((7)))) {
case 0: {
 BA.debugLineNum = 225;BA.debugLine="StartActivity(currency)";
Debug.ShouldStop(1);
main1.mostCurrent.__c.runVoidMethod ("StartActivity",main1.processBA,(Object)((main1.mostCurrent._currency.getObject())));
 break; }
case 1: {
 BA.debugLineNum = 228;BA.debugLine="StartActivity(donate)";
Debug.ShouldStop(8);
main1.mostCurrent.__c.runVoidMethod ("StartActivity",main1.processBA,(Object)((main1.mostCurrent._donate.getObject())));
 break; }
case 2: {
 BA.debugLineNum = 230;BA.debugLine="StartActivity(news)";
Debug.ShouldStop(32);
main1.mostCurrent.__c.runVoidMethod ("StartActivity",main1.processBA,(Object)((main1.mostCurrent._news.getObject())));
 break; }
case 3: {
 BA.debugLineNum = 232;BA.debugLine="StartActivity(mission)";
Debug.ShouldStop(128);
main1.mostCurrent.__c.runVoidMethod ("StartActivity",main1.processBA,(Object)((main1.mostCurrent._mission.getObject())));
 break; }
case 4: {
 BA.debugLineNum = 234;BA.debugLine="StartActivity(map)";
Debug.ShouldStop(512);
main1.mostCurrent.__c.runVoidMethod ("StartActivity",main1.processBA,(Object)((main1.mostCurrent._map.getObject())));
 break; }
case 5: {
 BA.debugLineNum = 237;BA.debugLine="ExitApplication";
Debug.ShouldStop(4096);
main1.mostCurrent.__c.runVoidMethod ("ExitApplication");
 break; }
}
;
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spotlightmenu_click(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("Spotlightmenu_Click (main1) ","main1",1,main1.mostCurrent.activityBA,main1.mostCurrent,206);
if (RapidSub.canDelegate("spotlightmenu_click")) return fullpentecostalchurch.home.blog.main1.remoteMe.runUserSub(false, "main1","spotlightmenu_click", _index);
Debug.locals.put("index", _index);
 BA.debugLineNum = 206;BA.debugLine="Sub Spotlightmenu_Click(index As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 207;BA.debugLine="Select index";
Debug.ShouldStop(16384);
switch (BA.switchObjectToInt(_index,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3))) {
case 0: {
 BA.debugLineNum = 209;BA.debugLine="StartActivity(prayer)";
Debug.ShouldStop(65536);
main1.mostCurrent.__c.runVoidMethod ("StartActivity",main1.processBA,(Object)((main1.mostCurrent._prayer.getObject())));
 break; }
case 1: {
 BA.debugLineNum = 211;BA.debugLine="StartActivity(email)";
Debug.ShouldStop(262144);
main1.mostCurrent.__c.runVoidMethod ("StartActivity",main1.processBA,(Object)((main1.mostCurrent._email.getObject())));
 break; }
case 2: {
 BA.debugLineNum = 213;BA.debugLine="ToastMessageShow(\"help\",False)";
Debug.ShouldStop(1048576);
main1.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("help")),(Object)(main1.mostCurrent.__c.getField(true,"False")));
 break; }
case 3: {
 BA.debugLineNum = 215;BA.debugLine="ToastMessageShow(\"help\",False)";
Debug.ShouldStop(4194304);
main1.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("help")),(Object)(main1.mostCurrent.__c.getField(true,"False")));
 break; }
}
;
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}