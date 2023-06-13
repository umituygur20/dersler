package day24stringbuilder;

public class Sb03 {
    public static void main(String[] args) {

        /**
         1) StringBuffer Javada String üreeten bir diğer classtir.
        StringBuffer Javanin String üretmek için oluşturduğu ilk classtir.

         2) StringBuffer , StringBuilder'a cok benzer , yani ikiside "mutable" String üretir.
         3) StringBuffer "multi - threat " 'dir ana StringBuilder "multi- threat" değildir.
         4) StringBuilder "multi-threat" olmadigi için StringBuffer dadn daha hızlı calisir.
         5)  5)"multi-thread" yapilirken yapilan islerin siralamasi onem arz eder,
         yapilan isleri mantikli bir siraya koymak "synchronization" olarak adlandirilir
         StringBuffer "multi-thread" oldugundan ayni zamanda "synchronized"dir


         3 tane String olusturan class öğrendik;
                    1 ) Immutable String lazimsa ; String Class
                    2 )Mutable String lazımsa ; StringBuffer veya StringBuilder kullanilir.
                                    a) StringBuffer "multi-threat" gerekirse kullaniliriz.
                                    b) StringBuilder "multi-threat" gerekmez ise kullanılır         */

    }
}
