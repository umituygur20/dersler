package day33exceptionsenumsiterator;

public class InvalidStudentGradeException extends Exception{
    //Compile time exception class'i...

    public InvalidStudentGradeException(String message){
        super(message);

        /**
         1) Costum Exception Class oluşturmak için Exception Class'a extend etmeliyiz
                Exception Class'a extend ederek oluşturduğumuz Costum Exception "Compile Exception" olur.
                Eğer Run Time Exception üretmek istersek "RunTimeException" class'a extend etmeliyiz.
         2) Costum Exception Class oluştururken Constructor oluşturmalıyız ve bu Constructor Parenttaki Constructor'ı çağırmalıdır.
            Bu Constructor mesaj verecek veya vermeyecek şekilde oluşturulabilir.
         3) Costum Exception class oluşturduğunuzda ismin sonunda Exception Kelimesini kullanmalısınız.(BestPractice)

         */
    }
}
