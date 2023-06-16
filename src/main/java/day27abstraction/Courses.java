package day27abstraction;

public abstract class Courses {
    //Abstraction        --- Kategorizasyon
//    Eğerki siz bir  classtan object olusturmasını istemiyorsanız ve bu
//    class'i zorunlu görevleri belirlemek istiyorsanız ABSTRACT Class devreye girer.

    //Abstraction
    public abstract void math();

    public void art(){
        System.out.println("Learn Art.");

    }


    /*
    1)Eger bir classtan object olusturulmasini istemiyorsak ve bu classi sadece
    child classlarin yapmak zorunda olduklari gorevleri belirlemek icin kullaniyorsak
    "Abstraction" yapariz.
    2)Bazen parent class daki methodun bodysi hicbir child class tarafindan kullanilmaz.
    Bu durumda parenttaki methoda body yazmak hic kullanilmadigi icin mantikli degildir
    Bizde yazmayiz
    3)Body si yazilmayan method Abstract Mehod denir. Abstract ingilizcede vucutsut yada soyut demektir
    4)Methodun body sini yazmayinca java bize hata verir, bizde abstract keywordunu kullanarak
    javaya bu methodun bodyis olmayacak deriz
    5)abstract keywordunu kullaninca elde ettigimiz abstract method normal classlara konulamaz
    o yuzden classi da abtstract yapmaliyiz
    6) Parent taki method abstract ise butun child classlar o methodu override etmek zorundadir
    Bu yuzden tum childler icin mecburi olmasini istedigimiz fonksiyonlari abstract yapmak mantikli bir secimdir.
    7) Body'si olan methodlar (Concrete Method) Abstract classlarin içine yazılabilir.Abstract Methodlar Concrete
    classlarin içine yazilamadi.Concrete methodlar child classlar tarafindan override edilmek zorunda değildir.
    8) "abstract keyword ile method body bir methodda ayni anda kullanılamazlar.
    9) final methodlar abstract olamazlar .final methodlar override edilemezler.halbuki abstract methodlar override
    edilmek için oluşturulurlar.Bu çekişkidir , bu yüzden Java Abstract methodlarin final olmasin müsaade etmez.
    10) "abstract class" larin içinde abstract method olur. "abstract methodlar" body'si olmadığından
    eksik methodlar gibi düşünülebilir. yani abstract class içinde eksik bir yapı barındırır.
    Eğer siz abstract classtan object üretirseniz bu eksiklik objeye yansır .Java bunu istemez .Çünkü eksik object eksik iş yapar.
    Buda application'in yanlış çalışmasına sebepe olur .Bu yüzden Java application'i korumak için abstract classlardan
    object üretilmesini engellemiştir.
    11) "abstract class"larin constructor'ı vardir. Ama object oluşturamazlar.
    12) "abstract" class'in abstract childi veya concrete childi olabiliyor.Eğer child abstract ise
    abstract methodlari override etmek zorunda değildir.
    13) abstract methodlar private olamazlar cunku child classlar abstract methodlari kullanirlar
    private yapinca kullanima kapali olur. Bu celiskidir, bu yuzden java abstract methodlarin
    private olmasina musade etmez
    14) Classlar final oldugunda child classa sahip olamazlar. Ama abstract classlar icin child class
    olmalidir, cunku child classlar abstract parent classdaki abstract methodlari kullanirlar
    bu yuzden java abstract classlarin final olmasina musaade etmez
    */

}
