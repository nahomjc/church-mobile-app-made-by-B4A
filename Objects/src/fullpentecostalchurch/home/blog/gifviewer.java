package fullpentecostalchurch.home.blog;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class gifviewer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "fullpentecostalchurch.home.blog.gifviewer");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", fullpentecostalchurch.home.blog.gifviewer.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _bitmapanddelay{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper bmp;
public int Delay;
public void Initialize() {
IsInitialized = true;
bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
Delay = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public int _workindex = 0;
public int _bdgravity = 0;
public anywheresoftware.b4a.objects.collections.List _bitmaps = null;
public fullpentecostalchurch.home.blog.main _main = null;
public fullpentecostalchurch.home.blog.main1 _main1 = null;
public fullpentecostalchurch.home.blog.chat _chat = null;
public fullpentecostalchurch.home.blog.currency _currency = null;
public fullpentecostalchurch.home.blog.facebook _facebook = null;
public fullpentecostalchurch.home.blog.youtube _youtube = null;
public fullpentecostalchurch.home.blog.mission _mission = null;
public fullpentecostalchurch.home.blog.news _news = null;
public fullpentecostalchurch.home.blog.note _note = null;
public fullpentecostalchurch.home.blog.prayer _prayer = null;
public fullpentecostalchurch.home.blog.map _map = null;
public fullpentecostalchurch.home.blog.donate _donate = null;
public fullpentecostalchurch.home.blog.email _email = null;
public fullpentecostalchurch.home.blog.starter _starter = null;
public String  _setgif(fullpentecostalchurch.home.blog.gifviewer __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "setgif"))
	return (String) Debug.delegate(ba, "setgif", new Object[] {_dir,_filename});
String _path = "";
anywheresoftware.b4a.agraham.gifdecoder.GifDecoder _gd = null;
int _i = 0;
fullpentecostalchurch.home.blog.gifviewer._bitmapanddelay _bd = null;
fullpentecostalchurch.home.blog.gifviewer._bitmapanddelay _firstframe = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _firstbmp = null;
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Public Sub SetGif (Dir As String, FileName As Stri";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="If Dir = File.DirAssets Then";
if ((_dir).equals(__c.File.getDirAssets())) { 
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="File.Copy(File.DirAssets, FileName, File.DirInte";
__c.File.Copy(__c.File.getDirAssets(),_filename,__c.File.getDirInternal(),_filename);
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="Dir = File.DirInternal";
_dir = __c.File.getDirInternal();
 };
RDebugUtils.currentLine=12058629;
 //BA.debugLineNum = 12058629;BA.debugLine="Dim path As String = File.Combine(Dir, FileName)";
_path = __c.File.Combine(_dir,_filename);
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="If Main.GifsCache.IsInitialized = False Then Main";
if (_main._gifscache.IsInitialized()==__c.False) { 
_main._gifscache.Initialize();};
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="If Main.GifsCache.ContainsKey(path) Then";
if (_main._gifscache.ContainsKey((Object)(_path))) { 
RDebugUtils.currentLine=12058632;
 //BA.debugLineNum = 12058632;BA.debugLine="bitmaps = Main.GifsCache.Get(path)";
__ref._bitmaps.setObject((java.util.List)(_main._gifscache.Get((Object)(_path))));
 }else {
RDebugUtils.currentLine=12058634;
 //BA.debugLineNum = 12058634;BA.debugLine="Dim gd As GifDecoder";
_gd = new anywheresoftware.b4a.agraham.gifdecoder.GifDecoder();
RDebugUtils.currentLine=12058635;
 //BA.debugLineNum = 12058635;BA.debugLine="gd.Load(Dir, FileName)";
_gd.Load(_dir,_filename);
RDebugUtils.currentLine=12058636;
 //BA.debugLineNum = 12058636;BA.debugLine="bitmaps.Initialize";
__ref._bitmaps.Initialize();
RDebugUtils.currentLine=12058637;
 //BA.debugLineNum = 12058637;BA.debugLine="For i = 0 To gd.FrameCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_gd.getFrameCount()-1);
_i = (int) (0) ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
RDebugUtils.currentLine=12058638;
 //BA.debugLineNum = 12058638;BA.debugLine="Dim bd As BitmapAndDelay";
_bd = new fullpentecostalchurch.home.blog.gifviewer._bitmapanddelay();
RDebugUtils.currentLine=12058639;
 //BA.debugLineNum = 12058639;BA.debugLine="bd.Initialize";
_bd.Initialize();
RDebugUtils.currentLine=12058640;
 //BA.debugLineNum = 12058640;BA.debugLine="bd.bmp = gd.Frame(i)";
_bd.bmp.setObject((android.graphics.Bitmap)(_gd.Frame(_i)));
RDebugUtils.currentLine=12058641;
 //BA.debugLineNum = 12058641;BA.debugLine="bd.Delay = gd.Delay(i)";
_bd.Delay = _gd.Delay(_i);
RDebugUtils.currentLine=12058642;
 //BA.debugLineNum = 12058642;BA.debugLine="bitmaps.Add(bd)";
__ref._bitmaps.Add((Object)(_bd));
 }
};
RDebugUtils.currentLine=12058644;
 //BA.debugLineNum = 12058644;BA.debugLine="Main.GifsCache.Put(path, bitmaps)";
_main._gifscache.Put((Object)(_path),(Object)(__ref._bitmaps.getObject()));
 };
RDebugUtils.currentLine=12058647;
 //BA.debugLineNum = 12058647;BA.debugLine="Dim FirstFrame As BitmapAndDelay = bitmaps.Get(0)";
_firstframe = (fullpentecostalchurch.home.blog.gifviewer._bitmapanddelay)(__ref._bitmaps.Get((int) (0)));
RDebugUtils.currentLine=12058648;
 //BA.debugLineNum = 12058648;BA.debugLine="Dim FirstBmp As Bitmap = FirstFrame.bmp";
_firstbmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_firstbmp = _firstframe.bmp;
RDebugUtils.currentLine=12058649;
 //BA.debugLineNum = 12058649;BA.debugLine="If FirstBmp.Width < mBase.Width Or FirstBmp.Heigh";
if (_firstbmp.getWidth()<__ref._mbase.getWidth() || _firstbmp.getHeight()<__ref._mbase.getHeight()) { 
RDebugUtils.currentLine=12058650;
 //BA.debugLineNum = 12058650;BA.debugLine="BDGravity = Gravity.CENTER";
__ref._bdgravity = __c.Gravity.CENTER;
 }else {
RDebugUtils.currentLine=12058652;
 //BA.debugLineNum = 12058652;BA.debugLine="BDGravity = Gravity.FILL";
__ref._bdgravity = __c.Gravity.FILL;
 };
RDebugUtils.currentLine=12058655;
 //BA.debugLineNum = 12058655;BA.debugLine="End Sub";
return "";
}
public String  _start(fullpentecostalchurch.home.blog.gifviewer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "start"))
	return (String) Debug.delegate(ba, "start", null);
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Public Sub Start";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="mBase.Visible = True";
__ref._mbase.setVisible(__c.True);
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="WorkIndex = WorkIndex + 1";
__ref._workindex = (int) (__ref._workindex+1);
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="ShowImpl(WorkIndex)";
__ref._showimpl(null,__ref._workindex);
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="End Sub";
return "";
}
public String  _callfromresume(fullpentecostalchurch.home.blog.gifviewer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "callfromresume"))
	return (String) Debug.delegate(ba, "callfromresume", null);
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Public Sub CallFromResume";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="If mBase.Visible Then Start";
if (__ref._mbase.getVisible()) { 
__ref._start(null);};
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(fullpentecostalchurch.home.blog.gifviewer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="Private mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
_defaultcolorconstant = (int) (-984833);
RDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="Private WorkIndex As Int";
_workindex = 0;
RDebugUtils.currentLine=11862022;
 //BA.debugLineNum = 11862022;BA.debugLine="Private BDGravity As Int";
_bdgravity = 0;
RDebugUtils.currentLine=11862023;
 //BA.debugLineNum = 11862023;BA.debugLine="Private bitmaps As List";
_bitmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11862024;
 //BA.debugLineNum = 11862024;BA.debugLine="Type BitmapAndDelay (bmp As Bitmap, Delay As Int)";
;
RDebugUtils.currentLine=11862025;
 //BA.debugLineNum = 11862025;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(fullpentecostalchurch.home.blog.gifviewer __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "designercreateview"))
	return (String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props});
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="mBase.Visible = False";
__ref._mbase.setVisible(__c.False);
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase(fullpentecostalchurch.home.blog.gifviewer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "getbase"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getbase", null);
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Public Sub GetBase As Panel";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="End Sub";
return null;
}
public String  _initialize(fullpentecostalchurch.home.blog.gifviewer __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname});
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="End Sub";
return "";
}
public void  _showimpl(fullpentecostalchurch.home.blog.gifviewer __ref,int _myworkindex) throws Exception{
ResumableSub_ShowImpl rsub = new ResumableSub_ShowImpl(this,__ref,_myworkindex);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowImpl extends BA.ResumableSub {
public ResumableSub_ShowImpl(fullpentecostalchurch.home.blog.gifviewer parent,fullpentecostalchurch.home.blog.gifviewer __ref,int _myworkindex) {
this.parent = parent;
this.__ref = __ref;
this._myworkindex = _myworkindex;
}
fullpentecostalchurch.home.blog.gifviewer __ref;
fullpentecostalchurch.home.blog.gifviewer parent;
int _myworkindex;
int _frameindex = 0;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bdrawable = null;
fullpentecostalchurch.home.blog.gifviewer._bitmapanddelay _bd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="gifviewer";
Debug.delegate(ba, "showimpl", new Object[] {_myworkindex});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="Dim FrameIndex As Int = 0";
_frameindex = (int) (0);
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="Do While MyWorkIndex = WorkIndex";
if (true) break;

case 1:
//do while
this.state = 4;
while (_myworkindex==__ref._workindex) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="FrameIndex = (FrameIndex + 1) Mod bitmaps.Size";
_frameindex = (int) ((_frameindex+1)%__ref._bitmaps.getSize());
RDebugUtils.currentLine=12320772;
 //BA.debugLineNum = 12320772;BA.debugLine="Dim bdrawable As BitmapDrawable";
_bdrawable = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=12320773;
 //BA.debugLineNum = 12320773;BA.debugLine="Dim bd As BitmapAndDelay = bitmaps.Get(FrameInde";
_bd = (fullpentecostalchurch.home.blog.gifviewer._bitmapanddelay)(__ref._bitmaps.Get(_frameindex));
RDebugUtils.currentLine=12320774;
 //BA.debugLineNum = 12320774;BA.debugLine="bdrawable.Initialize(bd.bmp)";
_bdrawable.Initialize((android.graphics.Bitmap)(_bd.bmp.getObject()));
RDebugUtils.currentLine=12320775;
 //BA.debugLineNum = 12320775;BA.debugLine="bdrawable.Gravity = BDGravity";
_bdrawable.setGravity(__ref._bdgravity);
RDebugUtils.currentLine=12320776;
 //BA.debugLineNum = 12320776;BA.debugLine="mBase.Background = bdrawable";
__ref._mbase.setBackground((android.graphics.drawable.Drawable)(_bdrawable.getObject()));
RDebugUtils.currentLine=12320777;
 //BA.debugLineNum = 12320777;BA.debugLine="Sleep(bd.Delay)";
parent.__c.Sleep(ba,this,_bd.Delay);
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
RDebugUtils.currentLine=12320779;
 //BA.debugLineNum = 12320779;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _stop(fullpentecostalchurch.home.blog.gifviewer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "stop"))
	return (String) Debug.delegate(ba, "stop", null);
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Public Sub Stop";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="mBase.Visible = False";
__ref._mbase.setVisible(__c.False);
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="WorkIndex = WorkIndex + 1";
__ref._workindex = (int) (__ref._workindex+1);
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="End Sub";
return "";
}
}