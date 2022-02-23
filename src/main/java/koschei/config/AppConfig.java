package koschei.config;

import koschei.KoscheiTheDeathless;
import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Ocean1 ocean() {
        return new Ocean1();
    }

    @Bean
    public KoscheiTheDeathless koscheiTheDeathless() {
        KoscheiTheDeathless koscheiTheDeathless = new KoscheiTheDeathless();
        koscheiTheDeathless.setOcean(ocean());
        return koscheiTheDeathless;
    }

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Wood3 wood(Rabbit4 rabbit) {
        return new Wood3(rabbit);
    }

    @Bean
    public static Rabbit4 rabbit(Duck5 duck) {
        return new Rabbit4(duck);
    }

    @Bean
    public static Duck5 duck() {
        return new Duck5();
    }

    @Bean
    public static Egg6 egg(Needle7 needle) {
        return  new Egg6(needle);
    }

    @Bean
    public static Needle7 needle() {
        Needle7 needle = new Needle7();
        needle.setDeth(deth());
        return new Needle7();
    }

    @Bean
    public static Deth8 deth() {
        return new Deth8();
    }



}
