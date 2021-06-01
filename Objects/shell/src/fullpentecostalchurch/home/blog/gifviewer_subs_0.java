package fullpentecostalchurch.home.blog;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class gifviewer_subs_0 {


public static RemoteObject  _callfromresume(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CallFromResume (gifviewer) ","gifviewer",17,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("callfromresume")) return __ref.runUserSub(false, "gifviewer","callfromresume", __ref);
 BA.debugLineNum = 68;BA.debugLine="Public Sub CallFromResume";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="If mBase.Visible Then Start";
Debug.ShouldStop(16);
if (__ref.getField(false,"_mbase").runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
__ref.runClassMethod (fullpentecostalchurch.home.blog.gifviewer.class, "_start");};
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private mEventName As String 'ignore";
gifviewer._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",gifviewer._meventname);
 //BA.debugLineNum = 5;BA.debugLine="Private mCallBack As Object 'ignore";
gifviewer._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",gifviewer._mcallback);
 //BA.debugLineNum = 6;BA.debugLine="Private mBase As Panel";
gifviewer._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mbase",gifviewer._mbase);
 //BA.debugLineNum = 7;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
gifviewer._defaultcolorconstant = BA.numberCast(int.class, -(double) (0 + 984833));__ref.setField("_defaultcolorconstant",gifviewer._defaultcolorconstant);
 //BA.debugLineNum = 8;BA.debugLine="Private WorkIndex As Int";
gifviewer._workindex = RemoteObject.createImmutable(0);__ref.setField("_workindex",gifviewer._workindex);
 //BA.debugLineNum = 9;BA.debugLine="Private BDGravity As Int";
gifviewer._bdgravity = RemoteObject.createImmutable(0);__ref.setField("_bdgravity",gifviewer._bdgravity);
 //BA.debugLineNum = 10;BA.debugLine="Private bitmaps As List";
gifviewer._bitmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_bitmaps",gifviewer._bitmaps);
 //BA.debugLineNum = 11;BA.debugLine="Type BitmapAndDelay (bmp As Bitmap, Delay As Int)";
;
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (gifviewer) ","gifviewer",17,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("designercreateview")) return __ref.runUserSub(false, "gifviewer","designercreateview", __ref, _base, _lbl, _props);
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 19;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="mBase = Base";
Debug.ShouldStop(524288);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 21;BA.debugLine="mBase.Visible = False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mbase").runMethod(true,"setVisible",gifviewer.__c.getField(true,"False"));
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (gifviewer) ","gifviewer",17,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("getbase")) return __ref.runUserSub(false, "gifviewer","getbase", __ref);
 BA.debugLineNum = 85;BA.debugLine="Public Sub GetBase As Panel";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="Return mBase";
Debug.ShouldStop(2097152);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (gifviewer) ","gifviewer",17,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "gifviewer","initialize", __ref, _ba, _callback, _eventname);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(16384);
__ref.setField ("_meventname",_eventname);
 BA.debugLineNum = 16;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(32768);
__ref.setField ("_mcallback",_callback);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setgif(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SetGif (gifviewer) ","gifviewer",17,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("setgif")) return __ref.runUserSub(false, "gifviewer","setgif", __ref, _dir, _filename);
RemoteObject _path = RemoteObject.createImmutable("");
RemoteObject _gd = RemoteObject.declareNull("anywheresoftware.b4a.agraham.gifdecoder.GifDecoder");
int _i = 0;
RemoteObject _bd = RemoteObject.declareNull("fullpentecostalchurch.home.blog.gifviewer._bitmapanddelay");
RemoteObject _firstframe = RemoteObject.declareNull("fullpentecostalchurch.home.blog.gifviewer._bitmapanddelay");
RemoteObject _firstbmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 24;BA.debugLine="Public Sub SetGif (Dir As String, FileName As Stri";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="If Dir = File.DirAssets Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_dir,gifviewer.__c.getField(false,"File").runMethod(true,"getDirAssets"))) { 
 BA.debugLineNum = 26;BA.debugLine="File.Copy(File.DirAssets, FileName, File.DirInte";
Debug.ShouldStop(33554432);
gifviewer.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(gifviewer.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename),(Object)(gifviewer.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filename));
 BA.debugLineNum = 27;BA.debugLine="Dir = File.DirInternal";
Debug.ShouldStop(67108864);
_dir = gifviewer.__c.getField(false,"File").runMethod(true,"getDirInternal");Debug.locals.put("Dir", _dir);
 };
 BA.debugLineNum = 29;BA.debugLine="Dim path As String = File.Combine(Dir, FileName)";
Debug.ShouldStop(268435456);
_path = gifviewer.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_dir),(Object)(_filename));Debug.locals.put("path", _path);Debug.locals.put("path", _path);
 BA.debugLineNum = 30;BA.debugLine="If Main.GifsCache.IsInitialized = False Then Main";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",gifviewer._main._gifscache.runMethod(true,"IsInitialized"),gifviewer.__c.getField(true,"False"))) { 
gifviewer._main._gifscache.runVoidMethod ("Initialize");};
 BA.debugLineNum = 31;BA.debugLine="If Main.GifsCache.ContainsKey(path) Then";
Debug.ShouldStop(1073741824);
if (gifviewer._main._gifscache.runMethod(true,"ContainsKey",(Object)((_path))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 32;BA.debugLine="bitmaps = Main.GifsCache.Get(path)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_bitmaps").setObject (gifviewer._main._gifscache.runMethod(false,"Get",(Object)((_path))));
 }else {
 BA.debugLineNum = 34;BA.debugLine="Dim gd As GifDecoder";
Debug.ShouldStop(2);
_gd = RemoteObject.createNew ("anywheresoftware.b4a.agraham.gifdecoder.GifDecoder");Debug.locals.put("gd", _gd);
 BA.debugLineNum = 35;BA.debugLine="gd.Load(Dir, FileName)";
Debug.ShouldStop(4);
_gd.runVoidMethod ("Load",(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 36;BA.debugLine="bitmaps.Initialize";
Debug.ShouldStop(8);
__ref.getField(false,"_bitmaps").runVoidMethod ("Initialize");
 BA.debugLineNum = 37;BA.debugLine="For i = 0 To gd.FrameCount - 1";
Debug.ShouldStop(16);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_gd.runMethod(true,"getFrameCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 38;BA.debugLine="Dim bd As BitmapAndDelay";
Debug.ShouldStop(32);
_bd = RemoteObject.createNew ("fullpentecostalchurch.home.blog.gifviewer._bitmapanddelay");Debug.locals.put("bd", _bd);
 BA.debugLineNum = 39;BA.debugLine="bd.Initialize";
Debug.ShouldStop(64);
_bd.runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="bd.bmp = gd.Frame(i)";
Debug.ShouldStop(128);
_bd.getField(false,"bmp").setObject (_gd.runMethod(false,"Frame",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 41;BA.debugLine="bd.Delay = gd.Delay(i)";
Debug.ShouldStop(256);
_bd.setField ("Delay",_gd.runMethod(true,"Delay",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 42;BA.debugLine="bitmaps.Add(bd)";
Debug.ShouldStop(512);
__ref.getField(false,"_bitmaps").runVoidMethod ("Add",(Object)((_bd)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 44;BA.debugLine="Main.GifsCache.Put(path, bitmaps)";
Debug.ShouldStop(2048);
gifviewer._main._gifscache.runVoidMethod ("Put",(Object)((_path)),(Object)((__ref.getField(false,"_bitmaps").getObject())));
 };
 BA.debugLineNum = 47;BA.debugLine="Dim FirstFrame As BitmapAndDelay = bitmaps.Get(0)";
Debug.ShouldStop(16384);
_firstframe = (__ref.getField(false,"_bitmaps").runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("FirstFrame", _firstframe);Debug.locals.put("FirstFrame", _firstframe);
 BA.debugLineNum = 48;BA.debugLine="Dim FirstBmp As Bitmap = FirstFrame.bmp";
Debug.ShouldStop(32768);
_firstbmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_firstbmp = _firstframe.getField(false,"bmp");Debug.locals.put("FirstBmp", _firstbmp);Debug.locals.put("FirstBmp", _firstbmp);
 BA.debugLineNum = 49;BA.debugLine="If FirstBmp.Width < mBase.Width Or FirstBmp.Heigh";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("<",_firstbmp.runMethod(true,"getWidth"),BA.numberCast(double.class, __ref.getField(false,"_mbase").runMethod(true,"getWidth"))) || RemoteObject.solveBoolean("<",_firstbmp.runMethod(true,"getHeight"),BA.numberCast(double.class, __ref.getField(false,"_mbase").runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 50;BA.debugLine="BDGravity = Gravity.CENTER";
Debug.ShouldStop(131072);
__ref.setField ("_bdgravity",gifviewer.__c.getField(false,"Gravity").getField(true,"CENTER"));
 }else {
 BA.debugLineNum = 52;BA.debugLine="BDGravity = Gravity.FILL";
Debug.ShouldStop(524288);
__ref.setField ("_bdgravity",gifviewer.__c.getField(false,"Gravity").getField(true,"FILL"));
 };
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
public static void  _showimpl(RemoteObject __ref,RemoteObject _myworkindex) throws Exception{
ResumableSub_ShowImpl rsub = new ResumableSub_ShowImpl(null,__ref,_myworkindex);
rsub.resume(null, null);
}
public static class ResumableSub_ShowImpl extends BA.ResumableSub {
public ResumableSub_ShowImpl(fullpentecostalchurch.home.blog.gifviewer parent,RemoteObject __ref,RemoteObject _myworkindex) {
this.parent = parent;
this.__ref = __ref;
this._myworkindex = _myworkindex;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
fullpentecostalchurch.home.blog.gifviewer parent;
RemoteObject _myworkindex;
RemoteObject _frameindex = RemoteObject.createImmutable(0);
RemoteObject _bdrawable = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _bd = RemoteObject.declareNull("fullpentecostalchurch.home.blog.gifviewer._bitmapanddelay");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowImpl (gifviewer) ","gifviewer",17,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("showimpl")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("MyWorkIndex", _myworkindex);
 BA.debugLineNum = 73;BA.debugLine="Dim FrameIndex As Int = 0";
Debug.ShouldStop(256);
_frameindex = BA.numberCast(int.class, 0);Debug.locals.put("FrameIndex", _frameindex);Debug.locals.put("FrameIndex", _frameindex);
 BA.debugLineNum = 74;BA.debugLine="Do While MyWorkIndex = WorkIndex";
Debug.ShouldStop(512);
if (true) break;

case 1:
//do while
this.state = 4;
while (RemoteObject.solveBoolean("=",_myworkindex,BA.numberCast(double.class, __ref.getField(true,"_workindex")))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 BA.debugLineNum = 75;BA.debugLine="FrameIndex = (FrameIndex + 1) Mod bitmaps.Size";
Debug.ShouldStop(1024);
_frameindex = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_frameindex,RemoteObject.createImmutable(1)}, "+",1, 1)),__ref.getField(false,"_bitmaps").runMethod(true,"getSize")}, "%",0, 1);Debug.locals.put("FrameIndex", _frameindex);
 BA.debugLineNum = 76;BA.debugLine="Dim bdrawable As BitmapDrawable";
Debug.ShouldStop(2048);
_bdrawable = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bdrawable", _bdrawable);
 BA.debugLineNum = 77;BA.debugLine="Dim bd As BitmapAndDelay = bitmaps.Get(FrameInde";
Debug.ShouldStop(4096);
_bd = (__ref.getField(false,"_bitmaps").runMethod(false,"Get",(Object)(_frameindex)));Debug.locals.put("bd", _bd);Debug.locals.put("bd", _bd);
 BA.debugLineNum = 78;BA.debugLine="bdrawable.Initialize(bd.bmp)";
Debug.ShouldStop(8192);
_bdrawable.runVoidMethod ("Initialize",(Object)((_bd.getField(false,"bmp").getObject())));
 BA.debugLineNum = 79;BA.debugLine="bdrawable.Gravity = BDGravity";
Debug.ShouldStop(16384);
_bdrawable.runMethod(true,"setGravity",__ref.getField(true,"_bdgravity"));
 BA.debugLineNum = 80;BA.debugLine="mBase.Background = bdrawable";
Debug.ShouldStop(32768);
__ref.getField(false,"_mbase").runMethod(false,"setBackground",(_bdrawable.getObject()));
 BA.debugLineNum = 81;BA.debugLine="Sleep(bd.Delay)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this),_bd.getField(true,"Delay"));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _start(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Start (gifviewer) ","gifviewer",17,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("start")) return __ref.runUserSub(false, "gifviewer","start", __ref);
 BA.debugLineNum = 57;BA.debugLine="Public Sub Start";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="mBase.Visible = True";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mbase").runMethod(true,"setVisible",gifviewer.__c.getField(true,"True"));
 BA.debugLineNum = 59;BA.debugLine="WorkIndex = WorkIndex + 1";
Debug.ShouldStop(67108864);
__ref.setField ("_workindex",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_workindex"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 60;BA.debugLine="ShowImpl(WorkIndex)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (fullpentecostalchurch.home.blog.gifviewer.class, "_showimpl",(Object)(__ref.getField(true,"_workindex")));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Stop (gifviewer) ","gifviewer",17,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("stop")) return __ref.runUserSub(false, "gifviewer","stop", __ref);
 BA.debugLineNum = 63;BA.debugLine="Public Sub Stop";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="mBase.Visible = False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbase").runMethod(true,"setVisible",gifviewer.__c.getField(true,"False"));
 BA.debugLineNum = 65;BA.debugLine="WorkIndex = WorkIndex + 1";
Debug.ShouldStop(1);
__ref.setField ("_workindex",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_workindex"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}