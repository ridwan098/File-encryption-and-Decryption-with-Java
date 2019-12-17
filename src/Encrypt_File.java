import java.io.File;
import javax.crypto.Cipher;
import java.util.Scanner;

class Encrypt_File {
    public static String key = "my favourite marvel hero is thor";
	private static Scanner uInput;
    public static void main(String[] args) {
    	
    	uInput = new Scanner(System.in);
    	
	 		
		System.out.println("Would like the program Info? ");
    	String response = uInput.nextLine();
    	
    	if(response .equals("Yes") || response .equals("yes")) {
    		System.out.println("\n\t\t\t\t*** PROGRAM INFO*** "
    				+ "\nThis program was created to encrypt the contents in a document"
    				+ "\nTo use this program, a file path needs to be entered above and the users needs to run the program"
    				+ "\nOnce the file has been encrypted, a password will be generated"
    				+ "\nThis password will be used to decrypt the document in the next program"
    				+ "\n\t\t\t\t***END OF PROGRAM INFO*** \n");
    		
    	}else {
    		 File inputFile = new File("Default Text.txt");
    	        File encryptedFile = new File("encrypted-file.encrypted");

    	        try {
    	            File_Processor.fileProcessor(Cipher.ENCRYPT_MODE, key, inputFile, encryptedFile);
    	            System.out.println("Your file has now been encrypted");
    	            System.out.println("The password is: " + key);

    	        } catch (Exception ex) {
    	            System.out.println(ex.getMessage());
    	            ex.printStackTrace();
    	        }
    	}	
       
    }

}






//C:/Users/Lenovo/DocumentsSample Data.txt
//http://www.avajava.com/tutorials/lessons/how-do-i-encrypt-and-decrypt-files-using-des.html
//http://www.macs.hw.ac.uk/~ml355/lore/pkencryption.htm
//https://www.youtube.com/watch?v=8AID7DKhSoM
//https://www.youtube.com/watch?v=NpaUuEvKXqs