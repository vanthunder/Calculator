package Calculator;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;




public class CalculatorController implements Initializable 
{
	 //All buttons
	 private Button B0;
	 private Button B1;
	 private Button B3;
	 private Button B4;
	 private Button B5;
	 private Button B6;
	 private Button B7;
	 private Button B8;
	 private Button B9;
	 private Button plus;
	 private Button minus;
	 private Button divide;
	 private Button multiplier;
	 private Button result;
	 private Button clrButton;
	 private Button erase;
	 private Button comma;
	 private Button clrhbutton;
	 
	 //Textfield
	 @FXML
	 private TextField Window;
	 @FXML
	 //TextArea
	 private TextArea textArea;
	 //ints to save inputs
	 private double input1;
	 private double input2;
	 
	 //int to count a button input
	 private int buttonCounter=0;
	 
	 //double to save the result
	 private double result1;
	 
	 //strings to save input
	 private String sinput = "";
	 private String sinput2 = "";
	 private String operatorInput = "";
	 private String inttostring;
	 private String resultString="";
	 private String historyTask="";
	 @FXML
	 private Label label;
	 
	  
	   @Override
	   public void initialize(URL location, ResourceBundle resources) 
	   {
	 
	       // TODO (don't really need to do anything here).
	      
	   }
	 
	   // When user click on myButton
	   // this method will be called.
	   public void B0press(ActionEvent event) 
	   
	   {
		   System.out.println("Button 0 Clicked!");
		   if(operatorInput.contentEquals(""))
		   {
	       sinput=sinput+"0";
	       input1=Double.parseDouble(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"0";
		   input2=Double.parseDouble(sinput2);
		   System.out.println(sinput2);
		   Window.setText(sinput+" "+operatorInput+" "+sinput2);
		   }
	   }
      public void B1press(ActionEvent event) 
	   
	   {
    	  System.out.println("Button 1 Clicked!");
		   if(operatorInput.contentEquals(""))
		   {
	       sinput=sinput+"1";
	       input1=Double.parseDouble(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"1";
		   input2=Double.parseDouble(sinput2);
		   System.out.println(sinput2);
		   Window.setText(sinput+" "+operatorInput+" "+sinput2);
		   }
	    }
      public void B2press(ActionEvent event) 
	   
	   {
    	   System.out.println("Button 2 Clicked!");
		   if(operatorInput.contentEquals(""))
		   {
	       sinput=sinput+"2";
	       input1=Double.parseDouble(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"2";
		   input2=Double.parseDouble(sinput2);
		   System.out.println(sinput2);
		   Window.setText(sinput+" "+operatorInput+" "+sinput2);
		   }
	   }
      public void B3press(ActionEvent event) 
	   
	   { 
    	   System.out.println("Button 3 Clicked!");
		   if(operatorInput.contentEquals(""))
		   {
	       sinput=sinput+"3";
	       input1=Double.parseDouble(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"3";
		   input2=Double.parseDouble(sinput2);
		   System.out.println(sinput2);
		   Window.setText(sinput+" "+operatorInput+" "+sinput2);
		   }
	   }
     public void B4press(ActionEvent event) 
	   
	   {
    	   System.out.println("Button 4 Clicked!");
		   if(operatorInput.contentEquals(""))
		   {
	       sinput=sinput+"4";
	       input1=Double.parseDouble(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"4";
		   input2=Double.parseDouble(sinput2);
		   System.out.println(sinput2);
		   Window.setText(sinput+" "+operatorInput+" "+sinput2);
		   }
	   }
     public void B5press(ActionEvent event) 
	   
	   {
    	   System.out.println("Button 5 Clicked!");
		   if(operatorInput.contentEquals(""))
		   {
	       sinput=sinput+"5";
	       input1=Double.parseDouble(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"5";
		   input2=Double.parseDouble(sinput2);
		   System.out.println(sinput2);
		   Window.setText(sinput+" "+operatorInput+" "+sinput2);
		   }
	    }
     public void B6press(ActionEvent event) 
	   
	   {
    	   System.out.println("Button 6 Clicked!");
		   if(operatorInput.contentEquals(""))
		   {
	       sinput=sinput+"6";
	       input1=Double.parseDouble(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"6";
		   input2=Double.parseDouble(sinput2);
		   System.out.println(sinput2);
		   Window.setText(sinput+" "+operatorInput+" "+sinput2);
		   }
	   }
    public void B7press(ActionEvent event) 
	   
	   {
    	   System.out.println("Button 7 Clicked!");
		   if(operatorInput.contentEquals(""))
		   {
	       sinput=sinput+"7";
	       input1=Double.parseDouble(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"7";
		   input2=Double.parseDouble(sinput2);
		   System.out.println(sinput2);
		   Window.setText(sinput+" "+operatorInput+" "+sinput2);
		   }
	   }
    public void B8press(ActionEvent event) 
	   
	   {
    	   System.out.println("Button 8 Clicked!");
		   if(operatorInput.contentEquals(""))
		   {
	       sinput=sinput+"8";
	       input1=Double.parseDouble(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"8";
		   input2=Double.parseDouble(sinput2);
		   System.out.println(sinput2);
		   Window.setText(sinput+" "+operatorInput+" "+sinput2);
		   }
	   }   
    public void B9press(ActionEvent event) 
	   
	   {
    	   System.out.println("Button 9 Clicked!");
		   if(operatorInput.contentEquals(""))
		   {
	       sinput=sinput+"9";
	       input1=Double.parseDouble(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"9";
		   input2=Double.parseDouble(sinput2);
		   System.out.println(sinput2);
		   Window.setText(sinput+" "+operatorInput+" "+sinput2);
		   }
	   }
    public void pluspress(ActionEvent event) 
	   
	   {
    	   System.out.println("Button + Clicked!");
	       operatorInput="+";
	       System.out.println(operatorInput);
	       Window.setText(sinput+" "+operatorInput);
	   }
    public void minuspress(ActionEvent event) 
	   
	   {
    	   if(sinput.contentEquals(""))
    	   {
    		 sinput="-";
    		 System.out.println(sinput);
    		 Window.setText(sinput);
    	   }
    	   else
    	   if(sinput2.contentEquals("") && !operatorInput.isEmpty())
    	   {
    		 sinput2="-";
      		 System.out.println(sinput2);
      		 Window.setText(sinput+" "+operatorInput+" "+sinput2); 
    	   }
    	   else
    	   if(!sinput.equals("") && sinput2.equals(""))
    	   {
    	   System.out.println("Button - Clicked!");
	       operatorInput="-";
	       System.out.println(operatorInput);
	       Window.setText(sinput+" "+operatorInput+" "+sinput2);
    	   }
	   }
   public void dividepress(ActionEvent event) 
      {
    	   System.out.println("Button / Clicked!");
	       operatorInput="/";
	       System.out.println(operatorInput);
	       Window.setText(sinput+" "+operatorInput);
      }
   public void multiplierpress(ActionEvent event) 
     {
	 System.out.println("Button * Clicked!");
     operatorInput="*";
     System.out.println(operatorInput);
     Window.setText(sinput+" "+operatorInput);
     }
   public void resultpress(ActionEvent event) 
    {
     System.out.println("Button = Clicked!");
     if(operatorInput.contentEquals("+"))
     {
    	 input1=input1+input2;
    	 System.out.println(input1);
         result1=input1;
     }
     else
     if(operatorInput.contentEquals("-"))
     {
    	 input1=input1-input2;
    	 System.out.println(input1);
         result1=input1;
     }
     else
     if(operatorInput.contentEquals("*"))
     {   input1=input1*input2;
         result1=input1;
         System.out.println(input1);
     }
     else
     if(operatorInput.contentEquals("/"))
     {
    	 input1=input1/input2;
         result1=input1;
         System.out.println(input1);
     }
     System.out.println(input1);
     resultString=String.valueOf(result1);
     Window.setText(sinput+" "+operatorInput+" "+sinput2+" "+"="+" "+resultString);
     historyTask=historyTask+"\n"+sinput+" "+operatorInput+" "+sinput2+" "+"="+" "+resultString;
     System.out.println(historyTask);
     textArea.setText(historyTask);	 
     }
  public void clrpress(ActionEvent event) 
     {
	 System.out.println("CLR");
     input1=0;
     input2=0;
     sinput="";
     sinput2="";
     operatorInput="";
     resultString="";
     Window.setText("");
     }
  public void commapress(ActionEvent event)
  {
	   System.out.println("Button , Clicked!");
	   if(!sinput.equals("") && !sinput.contains("."))
	   {
		 sinput=sinput+".";
		 System.out.println(sinput);
		 Window.setText(sinput);
	   }
	   else
	   if(!sinput2.contentEquals("") && !operatorInput.contentEquals("") && !sinput2.contains("."))
	   {
		 sinput2=sinput2+".";
  		 System.out.println(sinput2);
  		 Window.setText(sinput+" "+operatorInput+" "+sinput2); 
	   }
	   
  }
  public void erasepress(ActionEvent event)
  {    //WIP
	   System.out.println("Button ERS Clicked!");
	   if(!sinput.equals("") && operatorInput.isEmpty() && resultString.isEmpty())
	   {
		 sinput = sinput.substring(0, sinput.length()-1);
		 System.out.println(sinput);
		 if(!sinput.isEmpty() && !sinput.contentEquals("-"))
		 {	 
		 input1=Double.parseDouble(sinput);
		 }
		 System.out.println(sinput);
		 Window.setText(sinput);
	   }
	   else
	   if(!operatorInput.isEmpty() && resultString.isEmpty() && sinput2.isEmpty())
	   {
		 operatorInput = "";
		 Window.setText(sinput+operatorInput);
	   }
	   else
	   if(!sinput2.isEmpty() && resultString.isEmpty())
	   {
		 sinput2 = sinput2.substring(0, sinput2.length()-1);
		 if(!sinput2.isEmpty() && !sinput2.contentEquals("-"))
		 {	 
		 input2=Double.parseDouble(sinput2);
		 }
		 System.out.println(sinput2);
	  	 Window.setText(sinput+" "+operatorInput+" "+sinput2); 
	   }
	   
	   
	   
  }
  
  public void clrhPress(ActionEvent event)
  {
	  historyTask="";
	  textArea.setText("");
  }
	  
	}
