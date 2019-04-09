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
	 
	 //Textfield
	 @FXML
	 private TextField Window;
	 private TextArea area;
	 
	 
	 //ints to save inputs
	 private int input1;
	 private int input2;
	 
	 //strings to save input
	 private String sinput = "";
	 private String inttostring;
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
	       sinput=sinput+"0";
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
	   }
      public void B1press(ActionEvent event) 
	   
	   {
    	   System.out.println("Button 1 Clicked!");
	       sinput=sinput+"1";
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
	    }
      public void B2press(ActionEvent event) 
	   
	   {
    	   System.out.println("Button 2 Clicked!");
	       sinput=sinput+"2";
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
	   }
      public void B3press(ActionEvent event) 
	   
	   {
    	   System.out.println("Button 3 Clicked!");
	       sinput=sinput+"3";
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
	   }
     public void B4press(ActionEvent event) 
	   
	   {
    	   System.out.println("Button 4 Clicked!");
	       sinput=sinput+"4";
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
	   }
     public void B5press(ActionEvent event) 
	   
	   {
    	   System.out.println("Button 5 Clicked!");
	       sinput=sinput+"5";
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
	    }
     public void B6press(ActionEvent event) 
	   
	   {
    	   System.out.println("Button 6 Clicked!");
	       sinput=sinput+"6";
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
	   }
    public void B7press(ActionEvent event) 
	   
	   {
    	   System.out.println("Button 7 Clicked!");
	       sinput=sinput+"7";
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
	   }
    public void B8press(ActionEvent event) 
	   
	   {
    	   System.out.println("Button 8 Clicked!");
	       sinput=sinput+"8";
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
	   }   
    public void B9press(ActionEvent event) 
	   
	   {
    	   System.out.println("Button 9 Clicked!");
	       sinput=sinput+"9";
	       input1=Integer.parseInt(sinput);
	       System.out.println(sinput);
	       Window.setText(sinput);
	   }
    public void pluspress(ActionEvent event) 
	   
	   {
	       System.out.println("Button 0 Clicked!");
	       
	   }
    public void minuspress(ActionEvent event) 
	   
	   {
	       System.out.println("Button 0 Clicked!");
	   }
    public void dividepress(ActionEvent event) 
      {
          System.out.println("Button 0 Clicked!");
      }
 public void multiplierpress(ActionEvent event) 
     {
     System.out.println("Button 0 Clicked!");
     }
 public void resultpress(ActionEvent event) 
    {
     System.out.println("Button 0 Clicked!");
    }
 
	   
	  
	}
