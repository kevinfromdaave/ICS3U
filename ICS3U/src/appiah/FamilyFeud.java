/**
 * Kevin Appiah
 * Simplified version of family feud
 * 17/06/2016
 */
package appiah;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import hsa_new.Console;
public class FamilyFeud {

	static int x = 0;
	static int y = 0;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c = new Console(30, 100);
		Console text = new Console(20, 50);

		


		//Animal with a shell or tough skin
		String[] answerQOne = {"Turtle", "Snail", "Crab", "Rhino", "Armadillo", "Oyster"};
		String[] answerQTwo = {"Pee", "Use Washroom", "Washroom", "Brush Your Teeth", "Brush my teeth", "Brush Teeth", "Stretch", "Shower",  "Bath", "Sleep", "Go back to sleep", "Eat", "Breakfast", "Eat Breakfast"};
		String[] answerQThree = {"Keys", "Phone", "Cell Phone", "Change", "Money", "Weight", "mind", "Teeth"};
		String[] fastMoneyAns = {"Apple", "Math", "Grape", "Dog", "Michael Jordan"};
		
		// Declaring Pictures
		Image jpgfamilyFeudImage = Toolkit.getDefaultToolkit().getImage("familyFeudImage.jpg");
		Image jpgturtleImage = Toolkit.getDefaultToolkit().getImage("turtleImage.jpg");
		Image jpgsnailImage = Toolkit.getDefaultToolkit().getImage("snailImage.jpg");
		Image jpgcrabImage = Toolkit.getDefaultToolkit().getImage("crabImage.jpg");
		Image jpgrhinoImage = Toolkit.getDefaultToolkit().getImage("rhinoImage.jpg");
		Image jpgarmadilloImage = Toolkit.getDefaultToolkit().getImage("armadilloImage.jpg");
		Image jpgoysterImage = Toolkit.getDefaultToolkit().getImage("oysterImage.jpg");
		Image jpgpeeImage = Toolkit.getDefaultToolkit().getImage("peeImage.jpg");
		Image jpgbrushTeethImage = Toolkit.getDefaultToolkit().getImage("brushTeethImage.jpg");
		Image jpgstretchImage = Toolkit.getDefaultToolkit().getImage("stretchImage.jpg");
		Image jpgshowerImage = Toolkit.getDefaultToolkit().getImage("showerImage.jpg");
		Image jpgcoffeeImage = Toolkit.getDefaultToolkit().getImage("coffeeImage.jpg");
		Image jpglightsImage = Toolkit.getDefaultToolkit().getImage("lightsImage.jpg");
		Image jpgkeysImage = Toolkit.getDefaultToolkit().getImage("keysImage.jpg");
		Image jpgphoneImage = Toolkit.getDefaultToolkit().getImage("phoneImage.jpg");
		Image jpgchangeImage = Toolkit.getDefaultToolkit().getImage("changeImage.jpg");
		Image jpgweightImage = Toolkit.getDefaultToolkit().getImage("weightImage.jpg");
		Image jpgteethImage = Toolkit.getDefaultToolkit().getImage("teethImage.jpg");
		Image jpgwalletImage = Toolkit.getDefaultToolkit().getImage("walletImage.jpg");
		Image jpgsleepImage = Toolkit.getDefaultToolkit().getImage("sleepImage.jpg");
		Image jpgmindImage = Toolkit.getDefaultToolkit().getImage("mindImage.jpg");
		Image jpgeatImage = Toolkit.getDefaultToolkit().getImage("eatImage.jpg");




		//Variables
		String answer2;
		String answer1;
		String answer3;
		String answerF;
		int counter = 0;
		int score = 0;
		String fastMoney;


		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				x = me.getX();
				y = me.getY();

			}


		});
		Clip theme;
		try {
			
			theme = AudioSystem.getClip();
			theme.open(AudioSystem.getAudioInputStream(new File("Family Feud Theme (2010-Present).wav")));
			theme.start();
		
		//Question One

		text.println("Name an organism with a shell or hard skin. You have three strikes.");
		while(!(Toolkit.getDefaultToolkit().prepareImage(jpgfamilyFeudImage, jpgfamilyFeudImage.getWidth(null), jpgfamilyFeudImage.getHeight(null), null)));

		c.drawImage (jpgfamilyFeudImage, 150, 150, 500, 300, null);





		while(counter < 3 && score < 300){
			answer1 = text.readLine();
			if (checkAnswer(answer1, answerQOne)){
				if (answer1.equalsIgnoreCase(answerQOne[0])){

					while(!(Toolkit.getDefaultToolkit().prepareImage(jpgturtleImage, jpgturtleImage.getWidth(null), jpgturtleImage.getHeight(null), null)));

					c.drawImage (jpgturtleImage, 235, 235, 162, 42, null);
					score = score + 50;
					c.println("Score: " + score);
					theme.stop();
					
					theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
					theme.start();


				}

				if (answer1.equalsIgnoreCase(answerQOne[1])){

					while(!(Toolkit.getDefaultToolkit().prepareImage(jpgsnailImage, jpgsnailImage.getWidth(null), jpgsnailImage.getHeight(null), null)));

					c.drawImage (jpgsnailImage, 235, 283, 162, 42, null);
					score = score + 50;
					c.println("Score: " + score);
					theme.stop();
					
					theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
					theme.start();


				}
				if (answer1.equalsIgnoreCase(answerQOne[2])){

					while(!(Toolkit.getDefaultToolkit().prepareImage(jpgcrabImage, jpgcrabImage.getWidth(null), jpgcrabImage.getHeight(null), null)));

					c.drawImage (jpgcrabImage, 235, 330, 162, 42, null);					
					score = score + 50;
					c.println("Score: " + score);
					theme.stop();
					
					theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
					theme.start();
					

				}
				if (answer1.equalsIgnoreCase(answerQOne[3])){


					while(!(Toolkit.getDefaultToolkit().prepareImage(jpgrhinoImage, jpgrhinoImage.getWidth(null), jpgrhinoImage.getHeight(null), null)));

					c.drawImage (jpgrhinoImage, 235, 380, 162, 42, null);
					score = score + 50;
					c.println("Score: " + score);
					theme.stop();
					
					theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
					theme.start();


				}

				if (answer1.equalsIgnoreCase(answerQOne[4])){


					while(!(Toolkit.getDefaultToolkit().prepareImage(jpgarmadilloImage, jpgarmadilloImage.getWidth(null), jpgarmadilloImage.getHeight(null), null)));

					c.drawImage (jpgarmadilloImage, 403, 235, 162, 42, null);
					score = score + 50;
					c.println("Score: " + score);
					theme.stop();
					
					theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
					theme.start();
				}

				if (answer1.equalsIgnoreCase(answerQOne[5])){

					while(!(Toolkit.getDefaultToolkit().prepareImage(jpgoysterImage, jpgoysterImage.getWidth(null), jpgoysterImage.getHeight(null), null)));

					c.drawImage (jpgoysterImage, 403, 283, 162, 42, null);
					score = score + 50;
					c.println("Score: " + score);
					theme.stop();
					
					theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
					theme.start();


				}


			}
			else{
				counter++;
				text.println("Incorrect. That was strike " + counter);
				theme = AudioSystem.getClip();
				theme.open(AudioSystem.getAudioInputStream(new File("buzzerSound.wav")));
				theme.start();


			}

		}

		if (counter == 3){
			text.println("That's game over for you! You lose.");
			text.println("Your score was: " + score + " points");
			

		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Question Two
		
		counter = 0;
		if (score >= 300 ){
			c.clear();
			text.clear();


			while(!(Toolkit.getDefaultToolkit().prepareImage(jpgfamilyFeudImage, jpgfamilyFeudImage.getWidth(null), jpgfamilyFeudImage.getHeight(null), null)));

			c.drawImage (jpgfamilyFeudImage, 150, 150, 500, 300, null);
			text.println("Congratulations, you beat the first round. Welcom to round two.");
			text.println("Second question: What is the first thing you do in the morning.");

			while(counter < 3 && score < 600){


				answer2 = text.readLine();
				if(checkAnswer(answer2, answerQTwo)){


					if (answer2.equalsIgnoreCase(answerQTwo[0]) || answer2.equalsIgnoreCase(answerQTwo[1]) || answer2.equalsIgnoreCase(answerQTwo[2])){

						while(!(Toolkit.getDefaultToolkit().prepareImage(jpgpeeImage, jpgpeeImage.getWidth(null), jpgpeeImage.getHeight(null), null)));

						c.drawImage (jpgpeeImage, 235, 235, 162, 42, null);
						score = score + 50;		
						c.println("Score: " + score);
						
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
						theme.start();
					}
					//3, 4, 5
					if (answer2.equalsIgnoreCase(answerQTwo[3]) || answer2.equalsIgnoreCase(answerQTwo[4]) || answer2.equalsIgnoreCase(answerQTwo[5])) {

						while(!(Toolkit.getDefaultToolkit().prepareImage(jpgbrushTeethImage, jpgbrushTeethImage.getWidth(null), jpgbrushTeethImage.getHeight(null), null)));

						c.drawImage (jpgbrushTeethImage, 235, 283, 162, 42, null);
						score = score + 50;
						c.println("Score: " + score);
						
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
						theme.start();

					}
					//6
					if (answer2.equalsIgnoreCase(answerQTwo[6])){

						while(!(Toolkit.getDefaultToolkit().prepareImage(jpgstretchImage, jpgstretchImage.getWidth(null), jpgstretchImage.getHeight(null), null)));

						c.drawImage (jpgstretchImage, 235, 330, 162, 42, null);					
						score = score + 50;
						c.println("Score: " + score);
						
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
						theme.start();

					}

					if (answer2.equalsIgnoreCase(answerQTwo[7]) || answer2.equalsIgnoreCase(answerQTwo[8])){

						while(!(Toolkit.getDefaultToolkit().prepareImage(jpgshowerImage, jpgshowerImage.getWidth(null), jpgshowerImage.getHeight(null), null)));

						c.drawImage (jpgshowerImage, 235, 380, 162, 42, null);
						score = score + 50;
						c.println("Score: " + score);
						
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
						theme.start();

					}

					if (answer2.equalsIgnoreCase(answerQTwo[9]) || answer2.equalsIgnoreCase(answerQTwo[10])) {						

						while(!(Toolkit.getDefaultToolkit().prepareImage(jpgsleepImage, jpgsleepImage.getWidth(null), jpgsleepImage.getHeight(null), null)));

						c.drawImage (jpgsleepImage, 403, 235, 162, 42, null);
						score = score + 50;
						c.println("Score: " + score);
						
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
						theme.start();

					}

					if (answer2.equalsIgnoreCase(answerQTwo[11]) || (answer2.equalsIgnoreCase(answerQTwo[12]) || (answer2.equalsIgnoreCase(answerQTwo[13])))){

						while(!(Toolkit.getDefaultToolkit().prepareImage(jpgeatImage, jpgeatImage.getWidth(null), jpgeatImage.getHeight(null), null)));

						c.drawImage (jpgeatImage, 403, 283, 162, 42, null);
						score = score + 50;
						c.println("Score: " + score);
						
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
						theme.start();


					}
				}

				else{
					counter++;
					text.println("Incorrect. That was strike " + counter);
					theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("buzzerSound.wav")));
					theme.start();


				}


				if (counter == 3){

					text.println("That's game over for you! You lose.");
					text.println("Your score was: " + score + " points");
					

				}



			}



		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Question 3
		counter = 0;
		if (score >= 600){
			c.clear();
			text.clear();


			while(!(Toolkit.getDefaultToolkit().prepareImage(jpgfamilyFeudImage, jpgfamilyFeudImage.getWidth(null), jpgfamilyFeudImage.getHeight(null), null)));

			c.drawImage (jpgfamilyFeudImage, 150, 150, 500, 300, null);
			text.println("Congratulations, you've beat the second round. Welcome to round three, you're almost done.");
			text.println("Third question: Name something people lose.");

			while (counter < 3 && score < 900){


				answer3 = text.readLine();
				if(checkAnswer(answer3, answerQThree)){



					if (answer3.equalsIgnoreCase(answerQThree[0])){

						while(!(Toolkit.getDefaultToolkit().prepareImage(jpgkeysImage, jpgkeysImage.getWidth(null), jpgkeysImage.getHeight(null), null)));

						c.drawImage (jpgkeysImage, 235, 235, 162, 42, null);
						score = score + 50;		
						c.println("Score: " + score);
						
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
						theme.start();
					}

					if (answer3.equalsIgnoreCase(answerQThree[1]) || answer3.equalsIgnoreCase(answerQThree[2])){

						while(!(Toolkit.getDefaultToolkit().prepareImage(jpgphoneImage, jpgphoneImage.getWidth(null), jpgphoneImage.getHeight(null), null)));

						c.drawImage (jpgphoneImage, 235, 283, 162, 42, null);
						score = score + 50;
						c.println("Score: " + score);
						
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
						theme.start();

					}
					if (answer3.equalsIgnoreCase(answerQThree[3]) || answer3.equalsIgnoreCase(answerQThree[4])){

						while(!(Toolkit.getDefaultToolkit().prepareImage(jpgchangeImage, jpgchangeImage.getWidth(null), jpgchangeImage.getHeight(null), null)));

						c.drawImage (jpgchangeImage, 235, 330, 162, 42, null);					
						score = score + 50;		
						c.println("Score: " + score);
						
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
						theme.start();
					}

					if (answer3.equalsIgnoreCase(answerQThree[5])){

						while(!(Toolkit.getDefaultToolkit().prepareImage(jpgweightImage, jpgweightImage.getWidth(null), jpgweightImage.getHeight(null), null)));

						c.drawImage (jpgweightImage, 235, 380, 162, 42, null);
						score = score + 50;
						c.println("Score: " + score);
						
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
						theme.start();

					}
					if (answer3.equalsIgnoreCase(answerQThree[6])){

						while(!(Toolkit.getDefaultToolkit().prepareImage(jpgmindImage, jpgmindImage.getWidth(null), jpgmindImage.getHeight(null), null)));

						c.drawImage (jpgmindImage, 403, 235, 162, 42, null);
						score = score + 50;
						c.println("Score: " + score);
						
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
						theme.start();

					}

					if (answer3.equalsIgnoreCase(answerQThree[7])){

						while(!(Toolkit.getDefaultToolkit().prepareImage(jpgteethImage, jpgteethImage.getWidth(null), jpgteethImage.getHeight(null), null)));

						c.drawImage (jpgteethImage, 403, 283, 162, 42, null);
						score = score + 50;
						c.println("Score: " + score);
						
						theme = AudioSystem.getClip();
						theme.open(AudioSystem.getAudioInputStream(new File("glass_ping-Go445-1207030150.wav")));
						theme.start();

					}



				}
				else {
					counter++;
					text.println("Incorrect. That was strike " + counter);
					theme = AudioSystem.getClip();
					theme.open(AudioSystem.getAudioInputStream(new File("buzzerSound.wav")));
					theme.start();


					

				}

				if (counter == 3){

					text.println("That's game over for you! You lose.");
					text.println("Your score was: " + score + " points");
					
				}

			}
			
		}
		
		
		//Fast Money

		if (score >= 900)
		{
			text.clear();
			text.println("Congratulations you beat the game!!");
			text.println("Would you like to play fast money?");
			fastMoney = text.readLine();

			if (fastMoney.equalsIgnoreCase("Yes")){
				text.println("In fast money, the objective is to get only the number one answer. If you get any other answer, you lose fast money.");
				text.println("To start off, name a red fruit.");
				answerF = text.readLine();
				if (checkAnswer(answerF, fastMoneyAns)){

					if (answerF.equalsIgnoreCase(fastMoneyAns[0])){

						score = score + 50;
						text.println("Correct next question");
						text.println("What is the hardest school subject.");
						answerF = text.readLine();
						if (checkAnswer(answerF, fastMoneyAns)){

							if (answerF.equalsIgnoreCase(fastMoneyAns[1])){

								score = score + 50;
								text.println("Correct next question");
								text.println("Name a fruit, you can't buy one of.");
								answerF = text.readLine();
								if (checkAnswer(answerF, fastMoneyAns)){

									if (answerF.equalsIgnoreCase(fastMoneyAns[2])){

										score = score + 50;
										text.println("Correct next question");
										text.println("Name a house pet");
										answerF = text.readLine();
										if (checkAnswer(answerF, fastMoneyAns)){

											if (answerF.equalsIgnoreCase(fastMoneyAns[3])){

												score = score + 50;
												text.println("Correct, final question.");
												text.println("Name a famous basketball player.");
												answerF = text.readLine();
												if (checkAnswer(answerF, fastMoneyAns)){

													if (answerF.equalsIgnoreCase(fastMoneyAns[4])){

														score = score + 50;
														text.println("CORRECT, THAT WAS THE FINAL QUESTION, YOU WIN. Your score: " + score);
														theme = AudioSystem.getClip();
														theme.open(AudioSystem.getAudioInputStream(new File("applauseSound.wav")));
														theme.start();

														
													}


												}

												else{
													text.println("SO close! Sorry you lose.");
												}


											}
										}

										else {
											text.println("Incorrect, you lose fast money");
										}




									}



								}
								else {
									text.println("Incorrect, you lose fast money");
								}


							}

							else {
								text.println("Incorrect, you lose fast money");
							}
						}
						

					}

				}
				else{

					text.println("Game over, you lost fast money, but you beat the game.");
				}





			}
			
			else{
				
				text.println("Thanks for playing. Fast money is fun you should try it next.");
				
			}
		}
		}catch(Exception e){




		}






	}
	
	/**
	 * This method checks for the correct answer
	 * @param ans
	 * @param answers
	 * @return
	 */

	private static boolean checkAnswer (String ans, String[] answers){

		for (int i = 0; i<answers.length; i++){


			if (ans.equalsIgnoreCase(answers[i]))


				return true;


		}
		
		


		return false;


	}
	






}
