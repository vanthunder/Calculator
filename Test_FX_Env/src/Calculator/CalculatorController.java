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
	 
	 //Textfield
	 @FXML
	 private TextField Window;
	 
	 
	 //ints to save inputs
	 private int input1;
	 private int input2;
	 
	 //double to save the result
	 private double result1;
	 
	 //strings to save input
	 private String sinput = "";
	 private String sinput2 = "";
	 private String operatorInput = "";
	 private String inttostring;
	 private String resultString;
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
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"0";
		   input2=Integer.parseInt(sinput2);
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
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"1";
		   input2=Integer.parseInt(sinput2);
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
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"2";
		   input2=Integer.parseInt(sinput2);
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
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"3";
		   input2=Integer.parseInt(sinput2);
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
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"4";
		   input2=Integer.parseInt(sinput2);
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
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"5";
		   input2=Integer.parseInt(sinput2);
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
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"6";
		   input2=Integer.parseInt(sinput2);
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
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"7";
		   input2=Integer.parseInt(sinput2);
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
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"8";
		   input2=Integer.parseInt(sinput2);
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
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
		   }
		   if(!operatorInput.contentEquals(""))
		   {
		   sinput2=sinput2+"9";
		   input2=Integer.parseInt(sinput2);
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
    	   if(sinput2.contentEquals(""))
    	   {
    		 sinput2="-";
      		 System.out.println(sinput2);
      		 Window.setText(sinput+" "+operatorInput+" "+sinput2); 
    	   }
    	   else
    	   if(!sinput.isEmpty() || sinput2.isEmpty())
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
    	 //result1=input1+input1;
    	 input1=input1+input2;
    	 System.out.println(input1);
         result1=input1;
         
     }
     else
     if(operatorInput.contentEquals("-"))
     {
         result1=input1-input2;
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
         result1=input1/input1;
     }
     System.out.println(input1);
     resultString=String.valueOf(result1);
     Window.setText(sinput+" "+operatorInput+" "+sinput2+" "+"="+" "+resultString);
     }
  public void clrpress(ActionEvent event) 
     {
	 System.out.println("CLR");
     input1=0;
     input2=0;
     sinput="";
     sinput2="";
     operatorInput="";
     Window.setText("");
     }
  public void commapress(ActionEvent event)
  {
	   //WIP
	   System.out.println("Button , Clicked!");
  }
  public void erasepress(ActionEvent event)
  {    //WIP
	   System.out.println("Button , Clicked!");
  }
	  
	}
