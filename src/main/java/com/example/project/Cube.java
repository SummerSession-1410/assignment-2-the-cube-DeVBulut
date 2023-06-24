package com.example.project;

public class Cube{

    char[][] redSide    = new char[3][3];
    char[][] blueSide   = new char[3][3];
    char[][] orangeSide = new char[3][3];
    char[][] greenSide  = new char[3][3];
    char[][] yellowSide = new char[3][3];
    char[][] whiteSide  = new char[3][3];

    public static void main(final String[] args) {
        Cube cubeTest = new Cube();
        cubeTest.SetToDefault();
        if(args.length > 0){
            for(int i = 0; i < args.length; i++){
                cubeTest.CheckInput(args[i]);
            }
            cubeTest.VisualizeTheCube();
        }
    }

    public void CheckInput(String inputString){
        if(inputString.equals("u")){
            Up();
        }
        else if(inputString.equals("u'")){
            UpReverse();
        }
        else if(inputString.equals("d")){
            Down();
        }
        else if(inputString.equals("d'")){
            DownReverse();
        }
        else if(inputString.equals("r")){
            Right();
        }
        else if(inputString.equals("r'")){
            RightReverse();
        }
        else if(inputString.equals("l")){
            Left();
        }
        else if(inputString.equals("l'")){
            LeftReverse();
        }
        else if(inputString.equals("f")){
            Front();
        }
        else if(inputString.equals("f'")){
            FrontReverse();
        }
        else if(inputString.equals("b")){
            Back();
        }
        else if(inputString.equals("b'")){
            BackReverse();
        }
    }

    public void Back(){
        char[][] ttttempppRedSide = new char[3][3];
        ttttempppRedSide[0][2] = redSide[0][2];
        ttttempppRedSide[1][2] = redSide[1][2];
        ttttempppRedSide[2][2] = redSide[2][2];

        redSide[2][2] = whiteSide[2][0];
        redSide[1][2] = whiteSide[2][1];
        redSide[0][2] = whiteSide[2][2];

        whiteSide[2][0] = orangeSide[0][0];
        whiteSide[2][1] = orangeSide[1][0];
        whiteSide[2][2] = orangeSide[2][0];
        
        orangeSide[0][0] = yellowSide[0][2];
        orangeSide[1][0] = yellowSide[0][1];
        orangeSide[2][0] = yellowSide[0][0];

        yellowSide[0][0] = ttttempppRedSide[0][2];
        yellowSide[0][1] = ttttempppRedSide[1][2];
        yellowSide[0][2] = ttttempppRedSide[2][2];

        //Rotate the Back Face 

        char[][] tempGreenSide = new char[3][3];

        tempGreenSide[0][0] = greenSide[0][0];
        tempGreenSide[0][1] = greenSide[0][1];
        tempGreenSide[0][2] = greenSide[0][2];
        
        tempGreenSide[1][0] = greenSide[1][0];
        tempGreenSide[1][1] = greenSide[1][1];
        tempGreenSide[1][2] = greenSide[1][2];

        tempGreenSide[2][0] = greenSide[2][0];
        tempGreenSide[2][1] = greenSide[2][1];
        tempGreenSide[2][2] = greenSide[2][2];


        greenSide[0][0] = tempGreenSide[2][0];
        greenSide[0][1] = tempGreenSide[1][0];
        greenSide[0][2] = tempGreenSide[0][0];

        greenSide[1][0] = tempGreenSide[2][1];
        greenSide[1][1] = tempGreenSide[1][1];
        greenSide[1][2] = tempGreenSide[0][1];

        greenSide[2][0] = tempGreenSide[2][2];
        greenSide[2][1] = tempGreenSide[1][2];
        greenSide[2][2] = tempGreenSide[0][2];

    }

    public void BackReverse(){
        char[][] tempppRedSideeee = new char[3][3];
        tempppRedSideeee[0][2] = redSide[0][2];
        tempppRedSideeee[1][2] = redSide[1][2];
        tempppRedSideeee[2][2] = redSide[2][2];

        redSide[2][2] = yellowSide[0][2];
        redSide[1][2] = yellowSide[0][1];
        redSide[0][2] = yellowSide[0][0];

        yellowSide[0][0] = orangeSide[2][0];
        yellowSide[0][1] = orangeSide[1][0];
        yellowSide[0][2] = orangeSide[0][0];
        
        orangeSide[0][0] = whiteSide[2][0];
        orangeSide[1][0] = whiteSide[2][1];
        orangeSide[2][0] = whiteSide[2][2];

        whiteSide[2][0] = tempppRedSideeee[2][2];
        whiteSide[2][1] = tempppRedSideeee[1][2];
        whiteSide[2][2] = tempppRedSideeee[0][2];

        //Rotate the Back Face 

        char[][] tempGreenSide = new char[3][3];

        tempGreenSide[0][0] = greenSide[0][0];
        tempGreenSide[0][1] = greenSide[0][1];
        tempGreenSide[0][2] = greenSide[0][2];
        
        tempGreenSide[1][0] = greenSide[1][0];
        tempGreenSide[1][1] = greenSide[1][1];
        tempGreenSide[1][2] = greenSide[1][2];

        tempGreenSide[2][0] = greenSide[2][0];
        tempGreenSide[2][1] = greenSide[2][1];
        tempGreenSide[2][2] = greenSide[2][2];


        greenSide[0][0] = tempGreenSide[0][2];
        greenSide[0][1] = tempGreenSide[1][2];
        greenSide[0][2] = tempGreenSide[2][2];

        greenSide[1][0] = tempGreenSide[0][1];
        greenSide[1][1] = tempGreenSide[1][1];
        greenSide[1][2] = tempGreenSide[2][1];

        greenSide[2][0] = tempGreenSide[0][0];
        greenSide[2][1] = tempGreenSide[1][0];
        greenSide[2][2] = tempGreenSide[2][0];

    }

    public void Front(){

        char[][] temppppRedSide = new char[3][3];

        temppppRedSide[0][0] = redSide[0][0];
        temppppRedSide[1][0] = redSide[1][0];
        temppppRedSide[2][0] = redSide[2][0];
        
        redSide[0][0] = yellowSide[2][0];
        redSide[1][0] = yellowSide[2][1];
        redSide[2][0] = yellowSide[2][2];

        yellowSide[2][0] = orangeSide[2][2];
        yellowSide[2][1] = orangeSide[1][2];
        yellowSide[2][2] = orangeSide[0][2];

        orangeSide[0][2] = whiteSide[0][0];
        orangeSide[1][2] = whiteSide[0][1];
        orangeSide[2][2] = whiteSide[0][2];

        whiteSide[0][0] = temppppRedSide[2][0];
        whiteSide[0][1] = temppppRedSide[1][0];
        whiteSide[0][2] = temppppRedSide[0][0];

        //Rotate the Front Side
        char[][] tempBlueSide = new char[3][3];

        tempBlueSide[0][0] = blueSide[0][0];
        tempBlueSide[0][1] = blueSide[0][1];
        tempBlueSide[0][2] = blueSide[0][2];
        
        tempBlueSide[1][0] = blueSide[1][0];
        tempBlueSide[1][1] = blueSide[1][1];
        tempBlueSide[1][2] = blueSide[1][2];

        tempBlueSide[2][0] = blueSide[2][0];
        tempBlueSide[2][1] = blueSide[2][1];
        tempBlueSide[2][2] = blueSide[2][2];


        blueSide[0][0] = tempBlueSide[2][0];
        blueSide[0][1] = tempBlueSide[1][0];
        blueSide[0][2] = tempBlueSide[0][0];

        blueSide[1][0] = tempBlueSide[2][1];
        blueSide[1][1] = tempBlueSide[1][1];
        blueSide[1][2] = tempBlueSide[0][1];

        blueSide[2][0] = tempBlueSide[2][2];
        blueSide[2][1] = tempBlueSide[1][2];
        blueSide[2][2] = tempBlueSide[0][2];

    }

    public void FrontReverse(){

        char[][] temppRedSide = new char[3][3];

        temppRedSide[0][0] = redSide[0][0];
        temppRedSide[1][0] = redSide[1][0];
        temppRedSide[2][0] = redSide[2][0];
        
        redSide[0][0] = whiteSide[0][2];
        redSide[1][0] = whiteSide[0][1];
        redSide[2][0] = whiteSide[0][0];

        whiteSide[0][0] = orangeSide[0][2];
        whiteSide[0][1] = orangeSide[1][2];
        whiteSide[0][2] = orangeSide[2][2];

        orangeSide[0][2] = yellowSide[2][2];
        orangeSide[1][2] = yellowSide[2][1];
        orangeSide[2][2] = yellowSide[2][0];

        yellowSide[2][0] = temppRedSide[0][0];
        yellowSide[2][1] = temppRedSide[1][0];
        yellowSide[2][2] = temppRedSide[2][0];

        //Rotate the Front Side
        char[][] tempBlueSide = new char[3][3];

        tempBlueSide[0][0] = blueSide[0][0];
        tempBlueSide[0][1] = blueSide[0][1];
        tempBlueSide[0][2] = blueSide[0][2];
        
        tempBlueSide[1][0] = blueSide[1][0];
        tempBlueSide[1][1] = blueSide[1][1];
        tempBlueSide[1][2] = blueSide[1][2];

        tempBlueSide[2][0] = blueSide[2][0];
        tempBlueSide[2][1] = blueSide[2][1];
        tempBlueSide[2][2] = blueSide[2][2];


        blueSide[0][0] = tempBlueSide[0][2];
        blueSide[0][1] = tempBlueSide[1][2];
        blueSide[0][2] = tempBlueSide[2][2];

        blueSide[1][0] = tempBlueSide[0][1];
        blueSide[1][1] = tempBlueSide[1][1];
        blueSide[1][2] = tempBlueSide[2][1];

        blueSide[2][0] = tempBlueSide[0][0];
        blueSide[2][1] = tempBlueSide[1][0];
        blueSide[2][2] = tempBlueSide[2][0];

    }

    public void Left(){

        //Rotate the left side
        char[][] temprrrBlueSide = new char[3][3];

        temprrrBlueSide[0][0] = blueSide[0][0];
        temprrrBlueSide[1][0] = blueSide[1][0];
        temprrrBlueSide[2][0] = blueSide[2][0];

        blueSide[0][0] = yellowSide[0][0];
        blueSide[1][0] = yellowSide[1][0];
        blueSide[2][0] = yellowSide[2][0];

        yellowSide[0][0] = greenSide[2][2];
        yellowSide[1][0] = greenSide[1][2];
        yellowSide[2][0] = greenSide[0][2];

        greenSide[0][2] = whiteSide[2][0];
        greenSide[1][2] = whiteSide[1][0];
        greenSide[2][2] = whiteSide[0][0];

        whiteSide[0][0] = temprrrBlueSide[0][0];
        whiteSide[1][0] = temprrrBlueSide[1][0];
        whiteSide[2][0] = temprrrBlueSide[2][0];

        //Rotate the Orange Side
        char[][] tempOrangeSide = new char[3][3];

        tempOrangeSide[0][0] = orangeSide[0][0];
        tempOrangeSide[0][1] = orangeSide[0][1];
        tempOrangeSide[0][2] = orangeSide[0][2];
        
        tempOrangeSide[1][0] = orangeSide[1][0];
        tempOrangeSide[1][1] = orangeSide[1][1];
        tempOrangeSide[1][2] = orangeSide[1][2];

        tempOrangeSide[2][0] = orangeSide[2][0];
        tempOrangeSide[2][1] = orangeSide[2][1];
        tempOrangeSide[2][2] = orangeSide[2][2];

        orangeSide[0][0] = tempOrangeSide[2][0]; 
        orangeSide[0][1] = tempOrangeSide[1][0]; 
        orangeSide[0][2] = tempOrangeSide[0][0]; 

        orangeSide[1][0] = tempOrangeSide[2][1]; 
        orangeSide[1][1] = tempOrangeSide[1][1]; 
        orangeSide[1][2] = tempOrangeSide[0][1]; 

        orangeSide[2][0] = tempOrangeSide[2][2]; 
        orangeSide[2][1] = tempOrangeSide[1][2]; 
        orangeSide[2][2] = tempOrangeSide[0][2]; 

    }

     public void LeftReverse(){

        //Rotate the left side
        char[][] tempBlueSide = new char[3][3];

        tempBlueSide[0][0] = blueSide[0][0];
        tempBlueSide[1][0] = blueSide[1][0];
        tempBlueSide[2][0] = blueSide[2][0];

        blueSide[0][0] = whiteSide[0][0];
        blueSide[1][0] = whiteSide[1][0];
        blueSide[2][0] = whiteSide[2][0];

        whiteSide[0][0] = greenSide[2][2];
        whiteSide[1][0] = greenSide[1][2];
        whiteSide[2][0] = greenSide[0][2];

        greenSide[0][2] = yellowSide[2][0];
        greenSide[1][2] = yellowSide[1][0];
        greenSide[2][2] = yellowSide[0][0];

        yellowSide[0][0] = tempBlueSide[0][0];
        yellowSide[1][0] = tempBlueSide[1][0];
        yellowSide[2][0] = tempBlueSide[2][0];

        //Rotate the Orange Side
        char[][] tempppppOrangeSide = new char[3][3];

        tempppppOrangeSide[0][0] = orangeSide[0][0];
        tempppppOrangeSide[0][1] = orangeSide[0][1];
        tempppppOrangeSide[0][2] = orangeSide[0][2];
        
        tempppppOrangeSide[1][0] = orangeSide[1][0];
        tempppppOrangeSide[1][1] = orangeSide[1][1];
        tempppppOrangeSide[1][2] = orangeSide[1][2];

        tempppppOrangeSide[2][0] = orangeSide[2][0];
        tempppppOrangeSide[2][1] = orangeSide[2][1];
        tempppppOrangeSide[2][2] = orangeSide[2][2];


        orangeSide[0][0] = tempppppOrangeSide[0][2]; 
        orangeSide[0][1] = tempppppOrangeSide[1][2]; 
        orangeSide[0][2] = tempppppOrangeSide[2][2]; 

        orangeSide[1][0] = tempppppOrangeSide[0][1]; 
        orangeSide[1][1] = tempppppOrangeSide[1][1]; 
        orangeSide[1][2] = tempppppOrangeSide[2][1]; 

        orangeSide[2][0] = tempppppOrangeSide[0][0]; 
        orangeSide[2][1] = tempppppOrangeSide[1][0]; 
        orangeSide[2][2] = tempppppOrangeSide[2][0]; 

    }

    public void Up(){

        //#region Motion in Sides

        char[][] temporaryBlueSiiiiide = new char[3][3];
        //Store the Values inside the blue side before changing it. 
        temporaryBlueSiiiiide[0][0] = blueSide[0][0];
        temporaryBlueSiiiiide[0][1] = blueSide[0][1];
        temporaryBlueSiiiiide[0][2] = blueSide[0][2];

        blueSide[0][0] = redSide[0][0];
        blueSide[0][1] = redSide[0][1];
        blueSide[0][2] = redSide[0][2];

        redSide[0][0] = greenSide[0][0];
        redSide[0][1] = greenSide[0][1];
        redSide[0][2] = greenSide[0][2];

        greenSide[0][0] = orangeSide[0][0];
        greenSide[0][1] = orangeSide[0][1];
        greenSide[0][2] = orangeSide[0][2];

        orangeSide[0][0] = temporaryBlueSiiiiide[0][0];
        orangeSide[0][1] = temporaryBlueSiiiiide[0][1];
        orangeSide[0][2] = temporaryBlueSiiiiide[0][2];
        //#endregion

        //#region Motion in Tops 

        char[][] temporaryYellowSide = new char[3][3];
        //taking temporary sides
        temporaryYellowSide[0][0] = yellowSide[0][0];
        temporaryYellowSide[0][1] = yellowSide[0][1];
        temporaryYellowSide[0][2] = yellowSide[0][2];
        temporaryYellowSide[1][0] = yellowSide[1][0];
        temporaryYellowSide[1][1] = yellowSide[1][1];
        temporaryYellowSide[1][2] = yellowSide[1][2];
        temporaryYellowSide[2][0] = yellowSide[2][0];
        temporaryYellowSide[2][1] = yellowSide[2][1];
        temporaryYellowSide[2][2] = yellowSide[2][2];

        yellowSide[0][0] = temporaryYellowSide[2][0];
        yellowSide[0][1] = temporaryYellowSide[1][0];
        yellowSide[0][2] = temporaryYellowSide[0][0];
        yellowSide[1][0] = temporaryYellowSide[2][1];
        yellowSide[1][1] = temporaryYellowSide[1][1];
        yellowSide[1][2] = temporaryYellowSide[0][1];
        yellowSide[2][0] = temporaryYellowSide[2][2];
        yellowSide[2][1] = temporaryYellowSide[1][2];
        yellowSide[2][2] = temporaryYellowSide[0][2];


        //#endregion
        
    }

    public void UpReverse(){

         //#region Motion in Sides

        char[][] temporaryBlueSideee = new char[3][3];
        //Store the Values inside the blue side before changing it. 
        temporaryBlueSideee[0][0] = blueSide[0][0];
        temporaryBlueSideee[0][1] = blueSide[0][1];
        temporaryBlueSideee[0][2] = blueSide[0][2];

        blueSide[0][0] = orangeSide[0][0];
        blueSide[0][1] = orangeSide[0][1];
        blueSide[0][2] = orangeSide[0][2];

        orangeSide[0][0] = greenSide[0][0];
        orangeSide[0][1] = greenSide[0][1];
        orangeSide[0][2] = greenSide[0][2];

        greenSide[0][0] = redSide[0][0];
        greenSide[0][1] = redSide[0][1];
        greenSide[0][2] = redSide[0][2];

        redSide[0][0] = temporaryBlueSideee[0][0];
        redSide[0][1] = temporaryBlueSideee[0][1];
        redSide[0][2] = temporaryBlueSideee[0][2];
        //#endregion

        char[][] temporaryYellowSide = new char[3][3];
        temporaryYellowSide[0][0] = yellowSide[0][0];
        temporaryYellowSide[0][1] = yellowSide[0][1];
        temporaryYellowSide[0][2] = yellowSide[0][2];
        temporaryYellowSide[1][0] = yellowSide[1][0];
        temporaryYellowSide[1][1] = yellowSide[1][1];
        temporaryYellowSide[1][2] = yellowSide[1][2];
        temporaryYellowSide[2][0] = yellowSide[2][0];
        temporaryYellowSide[2][1] = yellowSide[2][1];
        temporaryYellowSide[2][2] = yellowSide[2][2];

        yellowSide[0][0] = temporaryYellowSide[0][2];
        yellowSide[0][1] = temporaryYellowSide[1][2];
        yellowSide[0][2] = temporaryYellowSide[2][2];
        yellowSide[1][0] = temporaryYellowSide[0][1];
        yellowSide[1][1] = temporaryYellowSide[1][1];
        yellowSide[1][2] = temporaryYellowSide[2][1];
        yellowSide[2][0] = temporaryYellowSide[0][0];
        yellowSide[2][1] = temporaryYellowSide[1][0];
        yellowSide[2][2] = temporaryYellowSide[2][0];
    }

    public void Down(){
        //#region Motion in Sides

        char[][] temporarybbbBlueSide = new char[3][3];
        //Store the Values inside the blue side before changing it. 
        temporarybbbBlueSide[2][0] = blueSide[2][0];
        temporarybbbBlueSide[2][1] = blueSide[2][1];
        temporarybbbBlueSide[2][2] = blueSide[2][2];

        blueSide[2][0] = orangeSide[2][0];
        blueSide[2][1] = orangeSide[2][1];
        blueSide[2][2] = orangeSide[2][2];

        orangeSide[2][0] = greenSide[2][0];
        orangeSide[2][1] = greenSide[2][1];
        orangeSide[2][2] = greenSide[2][2];

        greenSide[2][0] = redSide[2][0];
        greenSide[2][1] = redSide[2][1];
        greenSide[2][2] = redSide[2][2];

        redSide[2][0] = temporarybbbBlueSide[2][0];
        redSide[2][1] = temporarybbbBlueSide[2][1];
        redSide[2][2] = temporarybbbBlueSide[2][2];
        //#endregion

         //#region Motion in Tops 

        char[][] temporaryWhiteSide = new char[3][3];
        //taking temporary sides
        temporaryWhiteSide[0][0] = whiteSide[0][0];
        temporaryWhiteSide[0][1] = whiteSide[0][1];
        temporaryWhiteSide[0][2] = whiteSide[0][2];
        temporaryWhiteSide[1][0] = whiteSide[1][0];
        temporaryWhiteSide[1][1] = whiteSide[1][1];
        temporaryWhiteSide[1][2] = whiteSide[1][2];
        temporaryWhiteSide[2][0] = whiteSide[2][0];
        temporaryWhiteSide[2][1] = whiteSide[2][1];
        temporaryWhiteSide[2][2] = whiteSide[2][2];

        whiteSide[0][0] = temporaryWhiteSide[2][0];
        whiteSide[0][1] = temporaryWhiteSide[1][0];
        whiteSide[0][2] = temporaryWhiteSide[0][0];
        whiteSide[1][0] = temporaryWhiteSide[2][1];
        whiteSide[1][1] = temporaryWhiteSide[1][1];
        whiteSide[1][2] = temporaryWhiteSide[0][1];
        whiteSide[2][0] = temporaryWhiteSide[2][2];
        whiteSide[2][1] = temporaryWhiteSide[1][2];
        whiteSide[2][2] = temporaryWhiteSide[0][2];


        //#endregion
        
    }

    public void DownReverse(){
        //#region Motion in Sides

        char[][] temporrrarryBlueSide = new char[3][3];
        //Store the Values inside the blue side before changing it. 
        temporrrarryBlueSide[2][0] = blueSide[2][0];
        temporrrarryBlueSide[2][1] = blueSide[2][1];
        temporrrarryBlueSide[2][2] = blueSide[2][2];

        blueSide[2][0] = redSide[2][0];
        blueSide[2][1] = redSide[2][1];
        blueSide[2][2] = redSide[2][2];

        redSide[2][0] = greenSide[2][0];
        redSide[2][1] = greenSide[2][1];
        redSide[2][2] = greenSide[2][2];

        greenSide[2][0] = orangeSide[2][0];
        greenSide[2][1] = orangeSide[2][1];
        greenSide[2][2] = orangeSide[2][2];

        orangeSide[2][0] = temporrrarryBlueSide[2][0];
        orangeSide[2][1] = temporrrarryBlueSide[2][1];
        orangeSide[2][2] = temporrrarryBlueSide[2][2];
        //#endregion

         //#region Motion in Tops 

        char[][] temporaryWhiteSide = new char[3][3];
        //taking temporary sides
        temporaryWhiteSide[0][0] = whiteSide[0][0];
        temporaryWhiteSide[0][1] = whiteSide[0][1];
        temporaryWhiteSide[0][2] = whiteSide[0][2];
        temporaryWhiteSide[1][0] = whiteSide[1][0];
        temporaryWhiteSide[1][1] = whiteSide[1][1];
        temporaryWhiteSide[1][2] = whiteSide[1][2];
        temporaryWhiteSide[2][0] = whiteSide[2][0];
        temporaryWhiteSide[2][1] = whiteSide[2][1];
        temporaryWhiteSide[2][2] = whiteSide[2][2];

        whiteSide[0][0] = temporaryWhiteSide[0][2];
        whiteSide[0][1] = temporaryWhiteSide[1][2];
        whiteSide[0][2] = temporaryWhiteSide[2][2];
        whiteSide[1][0] = temporaryWhiteSide[0][1];
        whiteSide[1][1] = temporaryWhiteSide[1][1];
        whiteSide[1][2] = temporaryWhiteSide[2][1];
        whiteSide[2][0] = temporaryWhiteSide[0][0];
        whiteSide[2][1] = temporaryWhiteSide[1][0];
        whiteSide[2][2] = temporaryWhiteSide[2][0];


        //#endregion
        
    }
   
    public void Right(){
        char[][] temporaryBlueSide = new char[3][3];
        //Store the Values inside the blue side before changing it. 
        temporaryBlueSide[0][2] = blueSide[0][2];
        temporaryBlueSide[1][2] = blueSide[1][2];
        temporaryBlueSide[2][2] = blueSide[2][2];

        blueSide[0][2] = whiteSide[0][2];
        blueSide[1][2] = whiteSide[1][2];
        blueSide[2][2] = whiteSide[2][2];

        whiteSide[0][2] = greenSide[2][0];
        whiteSide[1][2] = greenSide[1][0];
        whiteSide[2][2] = greenSide[0][0];

        greenSide[0][0] = yellowSide[2][2];
        greenSide[1][0] = yellowSide[1][2];
        greenSide[2][0] = yellowSide[0][2];

        yellowSide[0][2] = temporaryBlueSide[0][2];
        yellowSide[1][2] = temporaryBlueSide[1][2];
        yellowSide[2][2] = temporaryBlueSide[2][2];

        //Red Side Rotation 
        char[][] temporaryRedSide = new char[3][3];

        temporaryRedSide[0][0] = redSide[0][0];
        temporaryRedSide[0][1] = redSide[0][1];
        temporaryRedSide[0][2] = redSide[0][2];

        temporaryRedSide[1][0] = redSide[1][0];
        temporaryRedSide[1][1] = redSide[1][1];
        temporaryRedSide[1][2] = redSide[1][2];

        temporaryRedSide[2][0] = redSide[2][0];
        temporaryRedSide[2][1] = redSide[2][1];
        temporaryRedSide[2][2] = redSide[2][2];

        redSide[0][0] = temporaryRedSide[2][0];
        redSide[0][1] = temporaryRedSide[1][0];
        redSide[0][2] = temporaryRedSide[0][0];

        redSide[1][0] = temporaryRedSide[2][1];
        redSide[1][1] = temporaryRedSide[1][1];
        redSide[1][2] = temporaryRedSide[0][1];

        redSide[2][0] = temporaryRedSide[2][2];
        redSide[2][1] = temporaryRedSide[1][2];
        redSide[2][2] = temporaryRedSide[0][2];
    }
    
     public void RightReverse(){

        char[][] temporaryyyyBlueSide = new char[3][3];
        //Store the Values inside the blue side before changing it. 
        temporaryyyyBlueSide[0][2] = blueSide[0][2];
        temporaryyyyBlueSide[1][2] = blueSide[1][2];
        temporaryyyyBlueSide[2][2] = blueSide[2][2];

        blueSide[0][2] = yellowSide[0][2];
        blueSide[1][2] = yellowSide[1][2];
        blueSide[2][2] = yellowSide[2][2];

        yellowSide[0][2] = greenSide[2][0];
        yellowSide[1][2] = greenSide[1][0];
        yellowSide[2][2] = greenSide[0][0];


        greenSide[0][0] = whiteSide[2][2];
        greenSide[1][0] = whiteSide[1][2];
        greenSide[2][0] = whiteSide[0][2];

        whiteSide[0][2] = temporaryyyyBlueSide[0][2];
        whiteSide[1][2] = temporaryyyyBlueSide[1][2];
        whiteSide[2][2] = temporaryyyyBlueSide[2][2];

        //Red Side Rotation 
        char[][] temporaryRedSide = new char[3][3];

        temporaryRedSide[0][0] = redSide[0][0];
        temporaryRedSide[0][1] = redSide[0][1];
        temporaryRedSide[0][2] = redSide[0][2];

        temporaryRedSide[1][0] = redSide[1][0];
        temporaryRedSide[1][1] = redSide[1][1];
        temporaryRedSide[1][2] = redSide[1][2];

        temporaryRedSide[2][0] = redSide[2][0];
        temporaryRedSide[2][1] = redSide[2][1];
        temporaryRedSide[2][2] = redSide[2][2];

        redSide[0][0] = temporaryRedSide[0][2];
        redSide[0][1] = temporaryRedSide[1][2];
        redSide[0][2] = temporaryRedSide[2][2];

        redSide[1][0] = temporaryRedSide[0][1];
        redSide[1][1] = temporaryRedSide[1][1];
        redSide[1][2] = temporaryRedSide[2][1];

        redSide[2][0] = temporaryRedSide[0][0];
        redSide[2][1] = temporaryRedSide[1][0];
        redSide[2][2] = temporaryRedSide[2][0];
    }

    public void VisualizeTheCube() {

        for (int i = 0; i < 3; i++) 
        {
            for (int a = 0; a < 3; a++) {
                System.out.print(redSide[i][a]);
                
                if(a != 2){
                    System.out.print('|');
                }
            }
            System.out.println();
        }

         System.out.println();

         for (int i = 0; i < 3; i++) 
        {
            for (int a = 0; a < 3; a++) {
                System.out.print(blueSide[i][a]);

                if(a != 2){
                    System.out.print('|');
                }
            }
            System.out.println();
        }

         System.out.println();

         for (int i = 0; i < 3; i++) 
        {
            for (int a = 0; a < 3; a++) {
                System.out.print(orangeSide[i][a]);

                if(a != 2){
                    System.out.print('|');
                }
            }
            System.out.println();
        }

         System.out.println();

         for (int i = 0; i < 3; i++) 
        {
            for (int a = 0; a < 3; a++) {
                System.out.print(greenSide[i][a]);

                if(a != 2){
                    System.out.print('|');
                }
            }
            System.out.println();
        }

         System.out.println();

         for (int i = 0; i < 3; i++) 
        {
            for (int a = 0; a < 3; a++) {
                System.out.print(yellowSide[i][a]);

                if(a != 2){
                    System.out.print('|');
                }
            }
            System.out.println();
        }

         System.out.println();

         for (int i = 0; i < 3; i++) 
        {
            for (int a = 0; a < 3; a++) {
                System.out.print(whiteSide[i][a]);

                if(a != 2){
                    System.out.print('|');
                }
            }
            System.out.println();
        }
    }

    public void SetToDefault() {

        whiteSide[0][0] = 'w';
        whiteSide[0][1] = 'w';
        whiteSide[0][2] = 'w';
        whiteSide[1][0] = 'w';
        whiteSide[1][1] = 'w';
        whiteSide[1][2] = 'w';
        whiteSide[2][0] = 'w';
        whiteSide[2][1] = 'w';
        whiteSide[2][2] = 'w';


        redSide[0][0] = 'r';
        redSide[0][1] = 'r';
        redSide[0][2] = 'r';
        redSide[1][0] = 'r';
        redSide[1][1] = 'r';
        redSide[1][2] = 'r';
        redSide[2][0] = 'r';
        redSide[2][1] = 'r';
        redSide[2][2] = 'r';


        blueSide[0][0] = 'b';
        blueSide[0][1] = 'b';
        blueSide[0][2] = 'b';
        blueSide[1][0] = 'b';
        blueSide[1][1] = 'b';
        blueSide[1][2] = 'b';
        blueSide[2][0] = 'b';
        blueSide[2][1] = 'b';
        blueSide[2][2] = 'b';


        orangeSide[0][0] = 'o';
        orangeSide[0][1] = 'o';
        orangeSide[0][2] = 'o';
        orangeSide[1][0] = 'o';
        orangeSide[1][1] = 'o';
        orangeSide[1][2] = 'o';
        orangeSide[2][0] = 'o';
        orangeSide[2][1] = 'o';
        orangeSide[2][2] = 'o';


        greenSide[0][0] = 'g';
        greenSide[0][1] = 'g';
        greenSide[0][2] = 'g';
        greenSide[1][0] = 'g';
        greenSide[1][1] = 'g';
        greenSide[1][2] = 'g';
        greenSide[2][0] = 'g';
        greenSide[2][1] = 'g';
        greenSide[2][2] = 'g';


        yellowSide[0][0] = 'y';
        yellowSide[0][1] = 'y';
        yellowSide[0][2] = 'y';
        yellowSide[1][0] = 'y';
        yellowSide[1][1] = 'y';
        yellowSide[1][2] = 'y';
        yellowSide[2][0] = 'y';
        yellowSide[2][1] = 'y';
        yellowSide[2][2] = 'y';

    }
}


