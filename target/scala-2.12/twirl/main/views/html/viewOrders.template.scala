
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._
/*7.2*/import models.users.Customer._


Seq[Any](format.raw/*1.35*/("""


"""),format.raw/*8.1*/("""
"""),_display_(/*9.2*/main("Order Confirmation", customer)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""


    """),format.raw/*12.5*/("""<div class="row">
    

        """),_display_(/*15.10*/for(x <- customer.getOrders()) yield /*15.40*/{_display_(Seq[Any](format.raw/*15.41*/("""
        """),format.raw/*16.9*/("""<div class="col-md-12">
            """),_display_(/*17.14*/if(flash.containsKey("success"))/*17.46*/ {_display_(Seq[Any](format.raw/*17.48*/("""
                  """),format.raw/*18.19*/("""<div class="alert alert-success">
                      """),_display_(/*19.24*/flash/*19.29*/.get("success")),format.raw/*19.44*/("""
                  """),format.raw/*20.19*/("""</div>
            """)))}),format.raw/*21.14*/(""" 
            
    
            """),format.raw/*24.13*/("""<table class="table table-bordered table-hover table-condensed">
                <thead>
                <!-- The header row-->
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Item Price</th>
                    <th>Quantity</th>
                    <th>Total</th>
                </tr>
                </thead>
                <tbody>
                    """),_display_(/*37.22*/if(x != null)/*37.35*/ {_display_(Seq[Any](format.raw/*37.37*/("""
                        """),format.raw/*38.25*/("""<!-- Start of For loop - For each p in products add a row -->
                        """),_display_(/*39.26*/for(i <- x.getItems) yield /*39.46*/ {_display_(Seq[Any](format.raw/*39.48*/("""
                        """),format.raw/*40.25*/("""<tr>
                            <td>"""),_display_(/*41.34*/i/*41.35*/.getProduct.getId),format.raw/*41.52*/("""</td>
                            <td>"""),_display_(/*42.34*/i/*42.35*/.getProduct.getName),format.raw/*42.54*/("""</td>
                            <td>"""),_display_(/*43.34*/i/*43.35*/.getProduct.getDescription),format.raw/*43.61*/("""</td>
                            <td>&euro; """),_display_(/*44.41*/("%.2f".format(i.getPrice))),format.raw/*44.68*/("""</td>
                            <td>"""),_display_(/*45.34*/i/*45.35*/.getQuantity()),format.raw/*45.49*/("""</td>
                            <td>&euro; """),_display_(/*46.41*/("%.2f".format(i.getItemTotal))),format.raw/*46.72*/("""</td>
                        </tr>
                        """)))}),format.raw/*48.26*/("""<!-- End of For loop -->
                  """)))}),format.raw/*49.20*/("""
                """),format.raw/*50.17*/("""</tbody>
            </table>
            <div class="row">
                <div class="col-md-12">
                    <p class="text-right"><strong>Order Total: &euro; """),_display_(/*54.72*/("%.2f".format(x.getOrderTotal))),format.raw/*54.104*/("""</strong></p>
                </div>  
            </div>
            </div>
        """)))}),format.raw/*58.10*/("""
    """),format.raw/*59.5*/("""</div>

""")))}),format.raw/*61.2*/("""
    """))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 16 12:28:48 GMT 2018
                  SOURCE: /home/wdd/webapps/lab6/app/views/viewOrders.scala.html
                  HASH: fc6fe8b20cb162929a0af7abb7cd36c5c279f95b
                  MATRIX: 968->1|1074->38|1110->68|1142->94|1174->120|1234->34|1263->151|1290->153|1334->189|1373->191|1407->198|1467->231|1513->261|1552->262|1588->271|1652->308|1693->340|1733->342|1780->361|1864->418|1878->423|1914->438|1961->457|2012->477|2072->509|2560->970|2582->983|2622->985|2675->1010|2789->1097|2825->1117|2865->1119|2918->1144|2983->1182|2993->1183|3031->1200|3097->1239|3107->1240|3147->1259|3213->1298|3223->1299|3270->1325|3343->1371|3391->1398|3457->1437|3467->1438|3502->1452|3575->1498|3627->1529|3719->1590|3794->1634|3839->1651|4037->1822|4091->1854|4208->1940|4240->1945|4279->1954
                  LINES: 28->1|31->4|32->5|33->6|34->7|37->1|40->8|41->9|41->9|41->9|44->12|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|53->21|56->24|69->37|69->37|69->37|70->38|71->39|71->39|71->39|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|77->45|77->45|77->45|78->46|78->46|80->48|81->49|82->50|86->54|86->54|90->58|91->59|93->61
                  -- GENERATED --
              */
          