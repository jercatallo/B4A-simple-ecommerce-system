B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=10.7
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

	Private radiotinola As RadioButton
	Private radiosinigang As RadioButton
	Private radioadobo As RadioButton
	Private txtprice As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("laymeals")
	txtprice.Text = 0
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub radiotinola_CheckedChange(Checked As Boolean)
	txtprice.Text = 50
End Sub

Private Sub radiosinigang_CheckedChange(Checked As Boolean)
	txtprice.Text = 40
End Sub

Private Sub radioadobo_CheckedChange(Checked As Boolean)
	txtprice.Text = 70
End Sub

Private Sub btnhome_Click
	Activity.Finish
End Sub

Private Sub btnclear_Click
	radiotinola.Checked = False
	radiosinigang.Checked = False
	radioadobo.Checked = False
	
	txtprice.Text = 0
End Sub

Private Sub btnaccept_Click
	If txtprice.Text = 0 Then
		ToastMessageShow("Please Complete your order for Meals", False)
	Else
		Main.priceforshoes = txtprice.Text
		Msgbox("Transaction for Meals Confirmed","Successful")
		Activity.Finish
	End If
	
End Sub