package l8;

import j9.d0;
import u9.b;
import w9.i;
import w9.k;
import w9.o;
import w9.t;

public interface f {
    @o("get_wallpaper")
    b<d0> a(@t("q") String str, @i("Access-Key") String str2);

    @o("add_spin_reward")
    b<d0> b(@t("q") String str, @i("Authorization") String str2, @i("Access-Key") String str3);

    @o("get_redeems")
    b<d0> c(@t("q") String str, @i("Authorization") String str2, @i("Access-Key") String str3);

    @o("get_transactions")
    b<d0> d(@t("q") String str, @i("Authorization") String str2, @i("Access-Key") String str3);

    @o("set_redeem")
    b<d0> e(@t("q") String str, @i("Authorization") String str2, @i("Access-Key") String str3);

    @k({"Accept: application/json"})
    @o("splash_data_update")
    b<d0> f(@t("q") String str, @i("Authorization") String str2, @i("Access-Key") String str3);

    @o("pre_splash_update")
    b<d0> g(@t("q") String str, @i("Access-Key") String str2);

    @o("user_signup")
    b<d0> h(@t("q") String str, @i("Access-Key") String str2);

    @o("checker")
    b<d0> i(@t("q") String str, @i("Access-Key") String str2);
}
