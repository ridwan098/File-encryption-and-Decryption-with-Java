import java.io.File;
import javax.crypto.Cipher;
import java.util.Scanner;

class Decrypt_File {
    private static Scanner input;

    public static void main(String[] args) {
    	
        String password;
        int counter = 3;

        input = new Scanner(System.in);
        do {
            System.out.println("Please enter your password: ");
            password = input.nextLine();


            if (password.equals(Encrypt_File.key)) {
                System.out.println("Your password is correct");

                File encryptedFile = new File("encrypted-file.encrypted");
                File decryptedFile = new File("decrypted-File.txt");

                try {
                    File_Processor.fileProcessor(Cipher.DECRYPT_MODE, Encrypt_File.key, encryptedFile, decryptedFile);
                    System.out.println("Your file has now been decrypted");

                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    ex.printStackTrace();
                }
            } else {
                counter--;
                System.out.println("Your Password is incorrect");
                System.out.println("You have " + counter + " attempt(s) left");
                System.out.println("");
                
                if (counter <= 0) {
                    System.out.println("You have entered the wrong password too many times");
                    System.out.println("The program will now close");
                    System.exit(0);
                }
            }
        } while (counter > 0 && !password.equals(Encrypt_File.key));

    }

}