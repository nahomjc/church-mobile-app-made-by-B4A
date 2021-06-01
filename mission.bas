B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private WebView1 As WebView
	Private Button1 As Button
	Private Button2 As Button
	
	Dim Urlrefersh As String
	Private Button3 As Button
	Private Button4 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("mission")
	WebView1.LoadUrl("https://fullpentecostalchurch.home.blog/mission/")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub Button1_Click
	StartActivity(main1)
End Sub

Sub Button2_Click
	WebView1.LoadUrl("https://fullpentecostalchurch.home.blog/mission/")
End Sub


Sub Button3_Click
	WebView1.Back
End Sub

Sub Button4_Click
	WebView1.Forward
End Sub