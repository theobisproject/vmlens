/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package templates

import _root_.scala.collection.JavaConversions._
import _root_.org.fusesource.scalate.support.TemplateConversions._
import _root_.org.fusesource.scalate.util.Measurements._

object $_scalate_$threadList_mustache {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    ;{
      val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
      import context._
      
      
      import _root_.org.fusesource.scalate.mustache._
      
      val $_scope_1 = Scope($_scalate_$_context)
      $_scalate_$_context << ( "<div class=\"" )
      $_scope_1.renderVariable("containerTyp", false)
      $_scalate_$_context << ( "\">\r\n \r\n \r\n   <div class=\"row\">\r\n    <div>\r\n      <h2 class=\"text-left\">" )
      $_scope_1.renderVariable("name", false)
      $_scalate_$_context << ( "</h2>\r\n    </div>\r\n  </div>\r\n \r\n\r\n\r\n" )
      $_scope_1.section("issues") { $_scope_2 =>
        $_scalate_$_context << ( "<div class=\"row text-left\"> \r\n\r\n<img src=\"../" )
        $_scope_2.renderVariable("image", true)
        $_scalate_$_context << ( "\" />" )
        $_scope_2.renderVariable("name", false)
        $_scalate_$_context << ( "\r\n\r\n\r\n </div>\r\n\r\n" )
      }
      $_scalate_$_context << ( "</div>" )
    }
  }
}


class $_scalate_$threadList_mustache extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$threadList_mustache.$_scalate_$render(context)
}
