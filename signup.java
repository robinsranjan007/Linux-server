import java.util.Scanner;

public class Signup {

	    public static void main(String[] args) {

		            Scanner sc = new Scanner(System.in);

			            System.out.println("===== USER SIGNUP =====");

				            System.out.print("Enter your name: ");
					            String name = sc.nextLine();

						            System.out.print("Enter your email: ");
							            String email = sc.nextLine();

								            System.out.print("Enter your password: ");
									            String password = sc.nextLine();

										            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
												                System.out.println("All fields are required!");
														        } 
											            else if (!email.contains("@")) {
													                System.out.println("Invalid email address!");
															        } 
												            else if (password.length() < 8) {
														                System.out.println("Password must contain at least 8 characters!");
																        } 
													            else {
															                System.out.println("\nSignup successful!");
																	            System.out.println("Welcome, " + name);
																		            }

														            sc.close();
															        }
}

