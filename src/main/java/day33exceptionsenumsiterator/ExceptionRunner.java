package day33exceptionsenumsiterator;

public class ExceptionRunner {

    /**
     * garbageCollector nasıl çalışır ?
     * Günlük hayattaki çöp toplama işlemine benziyor.Öncelikle silinmesi gereken çöpleri poşete koyuyor
     * daha sonra bu çöpleri gidip çöpe atıyor
     * Java'nın yaptığı bu işe "finalize" deniliyor.
     * Java ihtiyaç duyduğu zaman tüm bu işlemleri kendi kendine yapar.
     * e hocam kendi yapıyor madem sen bize bunları niye anlatıyon ?
     * -Çünkü interview da ssoracaklar "final" , "finally"( her halukarda calısan kod), "finalize" (Garbage collector 'un silmeden önce sileceği dataları toparlaması) arasında farklar nedir diyee!.
     */
    public static void main(String[] args) throws InvalidStudentGradeException {

        getStudentGrade(100);
        // getStudentGrade(110);
        getTheNumberOfStudents(50); //50
        getTheNumberOfStudents(-50);

    }

    public static void getStudentGrade(int grade) throws InvalidStudentGradeException {
        if (grade < 0 || grade > 100) {
            throw new InvalidStudentGradeException("Student's grades cannot be lass then zero or grater then 100");


        } else {
            System.out.println(grade);
        }

    }

    public static void getTheNumberOfStudents(int numOfStudents) {
        if (numOfStudents < 0) {
            throw new InvalidNumberException("Student number cannot be negative");
        } else {
            System.out.println(numOfStudents);
        }

    }
}
