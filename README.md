# Reviser! (Android Studio Application)
- Samkelo Khoza
- ST10470317
- 1
- Higher certificate in Mobile pplication Development
- Introduction to mobile Application Development

## Links
- **GitHub Repository**: https://github.com/VCSTDN2024/imad5112-assignment-2-SK842-maker.git
- **YouTube Video**: https://youtu.be/qTXmD0NMtvw

---

## Project Overview

The **Reviser!** is a mobile application developed as part of an assignment for the Introduction to Mobile Application Development Module  . The app's primary purpose is a simple Quiz application with a 
Welcome Screen
Quiz Scree
Score Screen
Review Screen

for the user to use to answer a set of Questions through True and False answers. These set of answers ar coded through a boolean array and the set of questions a Normal array. 
The app was developed to meet the requirements of the assignment, which includes creating a functional mobile app and utilizing GitHub for version control and CI/CD automation using GitHub Actions.

---

## Reviser! Apps  Purpose and Features

Reviser is an 4 screen Quiz application that allows users to answer an array of Questions through true or false answers. Reviser is created using an customised background and coded with 4 screen intents to swap between each. Reviser is a good useful learning application for students to study for tests and gain general Knowledge from these created quizzes.

### Sequential Features
 **Slide in animation**: this feature allows the user to wartcth the welcome message slide in after the Application Launches
 **true or flase buttons**: these buttons allow the user to answer the array set of questions 
**Review button**: this button takes the user to the review screen to review the questions and answers that they had got wrong in the quiz.


---

## Revisers Design

The design of the **Reviser!** Was done by the Following below:

- **User Experience (UX)**: The app was designed with providing the Used with a clean brigh friendly them that does cause any obstruction to the interface causing the user to feel very lossed in whats happening on the Screen. That is why for better design for each xml screen interface a drawable Background Image was added instead od using colours as the backhround.
- **Responsiveness**: Reviser!Was coded to respond efficiently allowing the user to easily swap eash array string after they click the Next Question button and move onto the next set Question.
- **Simplicity**: Design is simple and clean. Eacjh of the TextViws are organised properly to avoid any errors while the App is running inside of the Emulator.
  
---

### Reviser Application Screenshots:
![Screenshot 2025-05-20 163108](https://github.com/user-attachments/assets/6bbc44a1-dbf2-4ed2-9ac7-a6a6559d19e6)
Welcome Screen*

![Screenshot 2025-05-20 163130](https://github.com/user-attachments/assets/0818981d-f5b0-4659-83d3-2cbb1d30eee3)
*Quiz Screen*

![Screenshot 2025-05-20 163149](https://github.com/user-attachments/assets/77050ef3-5366-42e8-929a-788a7d05c050)
*ScoreBoard Screen*

![Screenshot 2025-05-20 163219](https://github.com/user-attachments/assets/3fd50f09-52a1-4f38-be81-b697ffc1fe77)
*Review Screen*

---

## Challenges and Learnings
- The first challenge I Encountered in this project was linking each of the array list of Images to their corresponding Questions strings. Therefore, they could Display effectively and efficiently.
•	I created another array list but used it for images therefor the index for the images matches the current question index therefor the order would not be messed up when the current Question index is loaded into the Question text view when the Quiz starts

- The Second challenge I encountered for this project was displaying the review text in the review text view of my Review kt file screen. 
	I eventually troubleshooted the issue by ensuring that my Text view width and height was large enough for the strings from the array in the quiz to be displayed in the review text view I also had to decrease the size of the text to ensure that the text size doesn’t cause any run time errors with the screen intents 
The Above Troubleshooting challenges I faced taught me how arrays react when linking a resource file to the Questions Index and how I can fetch string from a different screen and display them on another screen and append the text to not appear like it did  in the screen where the strings were fetched from.

-  The Third Challenge I encountered for this project was Pushing the Code to the correct repository and ensuring that the git repository Structure is correct.
 I used Microsoft Copilot to help me Troubleshoot the root directory path for pushing code to the repository and enabling the correct structure of the repository.

- The fourth Challenge I encountered was the Emulators Virtual device booting/Start up sequence.
  What I learned from this issue was that if the emulator fails to activate because of the virtual device not being able to start up or taking long to start up that it’s always essential to delete the virtual device and add another one. Therefor the ussie will not permit from happening again




---


## References
Anon., 2013. Android ImageView setImageResource in Code. [Online] 
Available at: https://stackoverflow.com/questions/12646354/android-imageview-setimageresource-in-code
[Accessed 20 May 2025].
Anon., 2020. Idiomatic Way of Using String Builder. [Online] 
Available at: https://stackoverflow.com/questions/57574853/idiomatic-way-of-using-stringbuilder-in-kotlin
[Accessed 20 May 2025].
Anon., 2022. How to set Background Drawable Programatically in Android. [Online] 
Available at: https://www.geeksforgeeks.org/how-to-set-background-drawable-programmatically-in-android/
[Accessed 20 May 2025].
Collective, M. D., 2011. Android Left to Right slide Animation. [Online] 
Available at: https://stackoverflow.com/questions/5151591/android-left-to-right-slide-animation
[Accessed 20 May 2025].
Maina, S., 2025. Can You Put a For Loop in an if Statement. [Online] 
Available at: https://builtin.com/software-engineering-perspectives/can-you-put-a-for-loop-in-an-if-statement#:~:text=Yes%2C%20a%20for%20loop%20can,based%20on%20conditions%20in%20Python.
[Accessed 7 April 2025].



---
## Disclosure of AI Usage in My Assessment


###  **Section(s) in which Generative AI was used:**
- **(Question 3 Version Control with GitHub)** Used AI to troubleshoot code pushing and updating Git repository structure to the Correct root path.
- **(Question 2 score Screen Logic)** Used Ai to help calculate the score Correctly and display it correctly in the specified text view
  
###  **Name of AI Tool(s) Used:**
- **ChatGPT**
- **Microsoft Copilot**

###  **Date in Which Generative AI Was Used:**
- Question  3 AI used on May 19, 2025 
- Question 2 AI used on   May 19, 2025


### **Link to the AI Chat or Screenshots:**
![Screenshot 2025-05-20 203133](https://github.com/user-attachments/assets/a48b98ad-4dc7-4639-b21a-9f898ebe881e)
-(Score Calculation Issue):  

- **GitHub repo Origin Update CMD AI chat link**
- https://chatgpt.com/c/682b2eba-78e8-8008-9bdf-7fed45f1af8f


