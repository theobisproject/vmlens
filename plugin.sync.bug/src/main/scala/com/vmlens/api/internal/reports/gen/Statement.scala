/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package templates

import _root_.scala.collection.JavaConversions._
import _root_.org.fusesource.scalate.support.TemplateConversions._
import _root_.org.fusesource.scalate.util.Measurements._

object $_scalate_$statement_mustache {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    ;{
      val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
      import context._
      
      
      import _root_.org.fusesource.scalate.mustache._
      
      val $_scope_1 = Scope($_scalate_$_context)
      $_scope_1.section("isWaitpoint") { $_scope_2 =>
        $_scalate_$_context << ( "<div class=\"row text-right\">  \r\n\r\n" )
        $_scope_2.renderVariable("textIntern", false)
        $_scalate_$_context << ( "\r\n\r\n<div style=\" top: 10px;  left: 20px; border: solid 1px red;  height: 100%;\"></div>\r\n\r\n </div> \r\n" )
      }
      $_scope_1.invertedSection("isWaitpoint") { $_scope_3 =>
        $_scalate_$_context << ( "<div class=\"row text-left\">  \r\n\r\n\r\n" )
        $_scope_3.section("spacerImage") { $_scope_4 =>
          $_scalate_$_context << ( "<img src=\"../" )
          $_scope_4.renderVariable("spacerImage", true)
          $_scalate_$_context << ( "\" />\r\n\r\n\r\n" )
        }
        $_scope_3.section("imagePrefix") { $_scope_5 =>
          $_scalate_$_context << ( "<img src=\"../" )
          $_scope_5.renderVariable("imagePrefix", true)
          $_scalate_$_context << ( "\" />\r\n\r\n\r\n" )
        }
        $_scalate_$_context << ( "<img src=\"../" )
        $_scope_3.renderVariable("image", true)
        $_scalate_$_context << ( "\" />\r\n" )
        $_scope_3.renderVariable("text", true)
        $_scalate_$_context << ( "\r\n\r\n\r\n  \r\n </div> \r\n " )
      }
    }
  }
}


class $_scalate_$statement_mustache extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$statement_mustache.$_scalate_$render(context)
}
