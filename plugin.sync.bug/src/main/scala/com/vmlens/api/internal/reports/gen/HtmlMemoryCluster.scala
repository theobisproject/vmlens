/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package templates

import _root_.scala.collection.JavaConversions._
import _root_.org.fusesource.scalate.support.TemplateConversions._
import _root_.org.fusesource.scalate.util.Measurements._

object $_scalate_$htmlMemoryCluster_mustache {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    ;{
      val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
      import context._
      
      
      import _root_.org.fusesource.scalate.mustache._
      
      val $_scope_1 = Scope($_scalate_$_context)
      $_scope_1.partial("header")
      $_scalate_$_context << ( "\r\n\r\n\r\n\r\n" )
      $_scope_1.section("issues") { $_scope_2 =>
        $_scalate_$_context << ( "<div class=\"row\">\r\n    <div class=\"col-md-6 col-md-offset-3\">\r\n      <h1 class=\"text-center\">Cluster " )
        $_scope_2.renderVariable("number", false)
        $_scalate_$_context << ( "</h1>\r\n    </div>\r\n  </div>\r\n\r\n\r\n <div class=\"" )
        $_scope_2.renderVariable("containerTyp", false)
        $_scalate_$_context << ( "\">\r\n\r\n<div class=\"row\">\r\n      <h3 >Shared State Accessed From:</h3>\r\n</div>\r\n\r\n\r\n " )
        $_scope_2.partial("parentTable")
        $_scalate_$_context << ( "\r\n\r\n\r\n\r\n<div class=\"row\">\r\n  \r\n\r\n\r\n\r\n<div class=\"row\">\r\n      <h3 >Shared State</h3>\r\n</div>\r\n\r\n\r\n <ul class=\"list-group\">\r\n\r\n" )
        $_scope_2.section("memory") { $_scope_3 =>
          $_scalate_$_context << ( "<li class=\"list-group-item\">" )
          $_scope_3.renderVariable("name", false)
          $_scalate_$_context << ( "</li>\r\n" )
        }
        $_scalate_$_context << ( "</ul>   \r\n  \r\n  \r\n</div>\r\n\r\n\r\n\r\n</div>\r\n\r\n\r\n" )
      }
      $_scope_1.partial("footer")
    }
  }
}


class $_scalate_$htmlMemoryCluster_mustache extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$htmlMemoryCluster_mustache.$_scalate_$render(context)
}
