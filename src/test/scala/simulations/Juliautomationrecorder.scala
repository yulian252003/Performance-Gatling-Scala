package simulations;
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Juliautomationrecorder extends Simulation {

  val httpProtocol = http
    .baseUrl("http://automationpractice.com")


  val headers_2 = Map("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.64 Safari/537.36")

 val headers_34 = Map(
    "Origin" -> "http://automationpractice.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.64 Safari/537.36"
  )

   val headers_41 = Map(
    "Accept" -> "text/css,*/*;q=0.1",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.64 Safari/537.36"
  )

  val headers_42 = Map(
    "Origin" -> "http://automationpractice.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.64 Safari/537.36",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="101", "Google Chrome";v="101""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "Windows"
  )

  val headers_47 = Map(
    "Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-US,en;q=0.9",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.64 Safari/537.36"
  )

   val headers_49 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.64 Safari/537.36"
  )

   val headers_55 = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
    "Origin" -> "http://automationpractice.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.64 Safari/537.36",
    "X-Requested-With" -> "XMLHttpRequest"
  )

   val uri2 = "https://fonts.gstatic.com/s/opensans/v28/memvYaGs126MiZpBA-UvWbX2vVnXBbObj2OVTS-muw.woff2"

   val uri3 = "http://fonts.googleapis.com/css"

   val scn = scenario("Juliautomationrecorder")
    .exec(
      http("request_0")
        .get("/themes/default-bootstrap/img/bg_bt.gif")
        .resources(
          http("request_1")
            .get("/themes/default-bootstrap/img/price-container-bg.png")
        )
    )
    .pause(12)
    .exec(
      http("request_2")
        .get("/js/jquery/jquery-1.11.0.min.js")
        .headers(headers_2)
        .resources(
          http("request_3")
            .get("/js/jquery/jquery-migrate-1.2.1.min.js")
            .headers(headers_2),
          http("request_4")
            .get("/js/jquery/plugins/jquery.easing.js")
            .headers(headers_2),
          http("request_5")
            .get("/js/tools.js")
            .headers(headers_2),
          http("request_6")
            .get("/themes/default-bootstrap/js/global.js")
            .headers(headers_2),
          http("request_7")
            .get("/themes/default-bootstrap/js/autoload/10-bootstrap.min.js")
            .headers(headers_2),
          http("request_8")
            .get("/themes/default-bootstrap/js/autoload/15-jquery.total-storage.min.js")
            .headers(headers_2),
          http("request_9")
            .get("/themes/default-bootstrap/js/autoload/15-jquery.uniform-modified.js")
            .headers(headers_2),
          http("request_10")
            .get("/js/jquery/plugins/fancybox/jquery.fancybox.js")
            .headers(headers_2),
          http("request_11")
            .get("/themes/default-bootstrap/js/products-comparison.js")
            .headers(headers_2),
          http("request_12")
            .get("/js/jquery/plugins/jquery.scrollTo.js")
            .headers(headers_2),
          http("request_13")
            .get("/js/jquery/plugins/jquery.serialScroll.js")
            .headers(headers_2),
          http("request_14")
            .get("/js/jquery/plugins/bxslider/jquery.bxslider.js")
            .headers(headers_2),
          http("request_15")
            .get("/themes/default-bootstrap/js/modules/blockcart/ajax-cart.js")
            .headers(headers_2),
          http("request_16")
            .get("/themes/default-bootstrap/js/tools/treeManagement.js")
            .headers(headers_2),
          http("request_17")
            .get("/themes/default-bootstrap/js/modules/blocknewsletter/blocknewsletter.js")
            .headers(headers_2),
          http("request_18")
            .get("/js/jquery/plugins/autocomplete/jquery.autocomplete.js")
            .headers(headers_2),
          http("request_19")
            .get("/themes/default-bootstrap/js/modules/blocksearch/blocksearch.js")
            .headers(headers_2),
          http("request_20")
            .get("/themes/default-bootstrap/js/modules/blockwishlist/js/ajax-wishlist.js")
            .headers(headers_2),
          http("request_21")
            .get("/themes/default-bootstrap/js/modules/blocktopmenu/js/hoverIntent.js")
            .headers(headers_2),
          http("request_22")
            .get("/themes/default-bootstrap/js/modules/blocktopmenu/js/superfish-modified.js")
            .headers(headers_2),
          http("request_23")
            .get("/themes/default-bootstrap/js/modules/blocktopmenu/js/blocktopmenu.js")
            .headers(headers_2),
          http("request_24")
            .get("/themes/default-bootstrap/css/product.css"),
          http("request_25")
            .get("/modules/socialsharing/css/socialsharing.css"),
          http("request_26")
            .get("/modules/sendtoafriend/sendtoafriend.css"),
          http("request_27")
            .get("/js/jquery/plugins/jquery.idTabs.js"),
          http("request_28")
            .get("/themes/default-bootstrap/js/product.js"),
          http("request_29")
            .get("/modules/socialsharing/js/socialsharing.js"),
          http("request_30")
            .get("/modules/productcomments/js/jquery.rating.pack.js"),
          http("request_31")
            .get("/themes/default-bootstrap/js/modules/sendtoafriend/sendtoafriend.js"),
          http("request_32")
            .get("/modules/productcomments/js/jquery.textareaCounter.plugin.js"),
          http("request_33")
            .get("/themes/default-bootstrap/js/modules/productcomments/js/productcomments.js"),
          http("request_34")
            .get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1")
            .headers(headers_34),
          http("request_35")
            .get("/themes/default-bootstrap/css/print.css"),
          http("request_36")
            .get("/modules/blockbanner/img/sale70.png")
            .headers(headers_2),
          http("request_37")
            .get("/img/logo.jpg")
            .headers(headers_2),
          http("request_38")
            .get("/img/p/1/0/10-cart_default.jpg")
            .headers(headers_2),
          http("request_39")
            .get("/img/c/3-0_thumb.jpg")
            .headers(headers_2),
          http("request_40")
            .get("/img/c/3-1_thumb.jpg")
            .headers(headers_2),
          http("request_41")
            .get(uri3 + "?family=Open+Sans:300,600&subset=latin,latin-ext")
            .headers(headers_41),
          http("request_42")
            .get(uri2)
            .headers(headers_42),
          http("request_43")
            .get("/img/p/8/8-home_default.jpg")
            .headers(headers_2),
          http("request_44")
            .get("/modules/productpaymentlogos/img/payment-logo.png"),
          http("request_45")
            .get("/themes/default-bootstrap/img/border-1.gif"),
          http("request_46")
            .get("/themes/default-bootstrap/img/footer-bg.png")
            .headers(headers_2),
          http("request_47")
            .get("/img/p/8/8-cart_default.jpg")
            .headers(headers_47),
          http("request_48")
            .get("/img/p/9/9-cart_default.jpg")
            .headers(headers_47),
          http("request_49")
            .get("/index.php?id_product=3&controller=product")
            .headers(headers_49),
          http("request_50")
            .get("/img/p/8/8-large_default.jpg")
            .headers(headers_47),
          http("request_51")
            .get("/img/p/8/8-medium_default.jpg")
            .headers(headers_47),
          http("request_52")
            .get("/themes/default-bootstrap/img/jquery/uniform/sprite.png"),
          http("request_53")
            .get("/img/favicon.ico?1461205423"),
          http("request_54")
            .get("/img/favicon.ico?1461205423")
        )
    )
    .pause(5)
    .exec(
      http("request_55")
        .post("/index.php?rand=1652367534623")
        .headers(headers_55)
        .formParam("controller", "cart")
        .formParam("add", "1")
        .formParam("ajax", "true")
        .formParam("qty", "1")
        .formParam("id_product", "3")
        .formParam("token", "e817bb0705dd58da8db074c69f729fd8")
        .formParam("ipa", "13")
        .resources(
          http("request_56")
            .get("/themes/default-bootstrap/img/bg_bt.gif")
        )
    )
    .pause(15)
    .exec(
      http("request_57")
        .get("/js/jquery/jquery-1.11.0.min.js")
        .headers(headers_2)
        .resources(
          http("request_58")
            .get("/js/jquery/jquery-migrate-1.2.1.min.js")
            .headers(headers_2),
          http("request_59")
            .get("/js/jquery/plugins/jquery.easing.js")
            .headers(headers_2),
          http("request_60")
            .get("/js/tools.js")
            .headers(headers_2),
          http("request_61")
            .get("/themes/default-bootstrap/js/global.js")
            .headers(headers_2),
          http("request_62")
            .get("/themes/default-bootstrap/js/autoload/10-bootstrap.min.js")
            .headers(headers_2),
          http("request_63")
            .get("/themes/default-bootstrap/js/autoload/15-jquery.total-storage.min.js")
            .headers(headers_2),
          http("request_64")
            .get("/themes/default-bootstrap/js/autoload/15-jquery.uniform-modified.js")
            .headers(headers_2),
          http("request_65")
            .get("/js/jquery/plugins/fancybox/jquery.fancybox.js")
            .headers(headers_2),
          http("request_66")
            .get("/themes/default-bootstrap/js/products-comparison.js")
            .headers(headers_2),
          http("request_67")
            .get("/themes/default-bootstrap/js/modules/blockcart/ajax-cart.js")
            .headers(headers_2),
          http("request_68")
            .get("/js/jquery/plugins/jquery.scrollTo.js")
            .headers(headers_2),
          http("request_69")
            .get("/js/jquery/plugins/jquery.serialScroll.js")
            .headers(headers_2),
          http("request_70")
            .get("/js/jquery/plugins/bxslider/jquery.bxslider.js")
            .headers(headers_2),
          http("request_71")
            .get("/themes/default-bootstrap/js/tools/treeManagement.js")
            .headers(headers_2),
          http("request_72")
            .get("/themes/default-bootstrap/js/modules/blocknewsletter/blocknewsletter.js")
            .headers(headers_2),
          http("request_73")
            .get("/themes/default-bootstrap/css/autoload/highdpi.css"),
          http("request_74")
            .get("/themes/default-bootstrap/css/autoload/responsive-tables.css"),
          http("request_75")
            .get("/themes/default-bootstrap/css/autoload/uniform.default.css"),
          http("request_76")
            .get("/js/jquery/plugins/fancybox/jquery.fancybox.css"),
          http("request_77")
            .get("/themes/default-bootstrap/css/addresses.css"),
          http("request_78")
            .get("/themes/default-bootstrap/css/global.css"),
          http("request_79")
            .get("/themes/default-bootstrap/css/modules/blockbanner/blockbanner.css"),
          http("request_80")
            .get("/themes/default-bootstrap/css/modules/blockcart/blockcart.css"),
          http("request_81")
            .get("/themes/default-bootstrap/css/modules/blockcategories/blockcategories.css"),
          http("request_82")
            .get("/themes/default-bootstrap/css/modules/blockcurrencies/blockcurrencies.css"),
          http("request_83")
            .get("/themes/default-bootstrap/css/modules/blockcontact/blockcontact.css"),
          http("request_84")
            .get("/themes/default-bootstrap/css/modules/blocknewsletter/blocknewsletter.css"),
          http("request_85")
            .get("/js/jquery/plugins/autocomplete/jquery.autocomplete.css"),
          http("request_86")
            .get("/themes/default-bootstrap/css/product_list.css"),
          http("request_87")
            .get("/themes/default-bootstrap/css/modules/blocklanguages/blocklanguages.css"),
          http("request_88")
            .get("/themes/default-bootstrap/css/modules/blocksearch/blocksearch.css"),
          http("request_89")
            .get("/themes/default-bootstrap/css/modules/blocktags/blocktags.css"),
          http("request_90")
            .get("/themes/default-bootstrap/css/modules/blockuserinfo/blockuserinfo.css"),
          http("request_91")
            .get("/themes/default-bootstrap/css/modules/blockviewed/blockviewed.css"),
          http("request_92")
            .get("/modules/themeconfigurator/css/hooks.css"),
          http("request_93")
            .get("/themes/default-bootstrap/css/modules/blockwishlist/blockwishlist.css"),
          http("request_94")
            .get("/themes/default-bootstrap/css/modules/productcomments/productcomments.css"),
          http("request_95")
            .get("/themes/default-bootstrap/css/modules/blocktopmenu/css/blocktopmenu.css"),
          http("request_96")
            .get("/themes/default-bootstrap/css/modules/blocktopmenu/css/superfish-modified.css"),
          http("request_97")
            .get("/js/jquery/plugins/jquery.typewatch.js"),
          http("request_98")
            .get("/themes/default-bootstrap/js/cart-summary.js"),
          http("request_99")
            .get("/js/jquery/plugins/autocomplete/jquery.autocomplete.js")
            .headers(headers_2),
          http("request_100")
            .get("/themes/default-bootstrap/js/modules/blocksearch/blocksearch.js")
            .headers(headers_2),
          http("request_101")
            .get("/themes/default-bootstrap/js/modules/blockwishlist/js/ajax-wishlist.js")
            .headers(headers_2),
          http("request_102")
            .get("/themes/default-bootstrap/js/modules/blocktopmenu/js/hoverIntent.js")
            .headers(headers_2),
          http("request_103")
            .get("/themes/default-bootstrap/js/modules/blocktopmenu/js/superfish-modified.js")
            .headers(headers_2),
          http("request_104")
            .get("/themes/default-bootstrap/js/modules/blocktopmenu/js/blocktopmenu.js")
            .headers(headers_2),
          http("request_105")
            .get("/modules/blockbanner/img/sale70.png")
            .headers(headers_2),
          http("request_106")
            .get("/img/logo.jpg")
            .headers(headers_2),
          http("request_107")
            .get("/img/p/1/0/10-cart_default.jpg")
            .headers(headers_2),
          http("request_108")
            .get(uri3 + "?family=Open+Sans:300,600&subset=latin,latin-ext")
            .headers(headers_41),
          http("request_109")
            .get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1")
            .headers(headers_34),
          http("request_110")
            .get(uri2)
            .headers(headers_42),
          http("request_111")
            .get("/img/p/8/8-cart_default.jpg")
            .headers(headers_2),
          http("request_112")
            .get("/img/c/3-0_thumb.jpg")
            .headers(headers_2),
          http("request_113")
            .get("/img/c/3-1_thumb.jpg")
            .headers(headers_2),
          http("request_114")
            .get("/img/p/8/8-small_default.jpg"),
          http("request_115")
            .get("/img/p/1/0/10-small_default.jpg"),
          http("request_116")
            .get("/themes/default-bootstrap/img/order-step-current.png"),
          http("request_117")
            .get("/themes/default-bootstrap/img/order-step-a.png"),
          http("request_118")
            .get("/themes/default-bootstrap/img/footer-bg.png")
            .headers(headers_2),
          http("request_119")
            .get("/index.php?controller=order")
            .headers(headers_49)
        )
    )

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
