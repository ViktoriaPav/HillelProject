package com.pavlova.lecture.lecture_01;

public class Task_2 {

   int CatYears;
   int DogYears;



   public int Cat_Years(int HumanYears){

       if(HumanYears >= 1){
          CatYears = 15;
       }
       if (HumanYears >= 2){
          CatYears = CatYears + 9;
       }
       if(HumanYears >= 3){
           CatYears = CatYears + (HumanYears - 2) * 4;
       }
       return CatYears;
   }

   public int Dog_Years(int HumanYears){

       if(HumanYears >= 1){
           DogYears = 15;
           if (HumanYears >= 2){
               DogYears = DogYears + 9;
               if(HumanYears >= 3){
                   DogYears = DogYears + (HumanYears - 2) * 5;
               }
           }
       }


       return DogYears ;

   }

    public static void main(String[] args) {
        Task_2 task_2 = new Task_2();
        int HumanYears = 4;
        System.out.println("HumanYears: " + HumanYears);

        System.out.println("CatYears: " + task_2.Cat_Years(HumanYears) );
        System.out.println("DogYears: " + task_2.Dog_Years(HumanYears) );
    }

}
