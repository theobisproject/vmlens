/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package templates

import _root_.scala.collection.JavaConversions._
import _root_.org.fusesource.scalate.support.TemplateConversions._
import _root_.org.fusesource.scalate.util.Measurements._

object $_scalate_$htmlIssue_mustache {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    ;{
      val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
      import context._
      
      
      import _root_.org.fusesource.scalate.mustache._
      
      val $_scope_1 = Scope($_scalate_$_context)
      $_scope_1.partial("header")
      $_scalate_$_context << ( "\r\n\r\n\r\n<!-- htmlIssue.mustache -->\r\n\r\n<div class=\"" )
      $_scope_1.renderVariable("containerTyp", false)
      $_scalate_$_context << ( "\">\r\n \r\n " )
      $_scope_1.section("issues") { $_scope_2 =>
        $_scalate_$_context << ( "<div class=\"row text-left\">\r\n  \r\n " )
        $_scope_2.section("imagePath") { $_scope_3 =>
          $_scalate_$_context << ( "<img src=\"../" )
          $_scope_3.renderVariable("imagePath", true)
          $_scalate_$_context << ( "\" />\r\n" )
        }
        $_scope_2.section("hasLink") { $_scope_4 =>
          $_scalate_$_context << ( "<a   href=\"" )
          $_scope_4.renderVariable("link", false)
          $_scalate_$_context << ( "\" > " )
          $_scope_4.renderVariable("nameWithHtml", true)
          $_scalate_$_context << ( " </a> " )
        }
        $_scope_2.invertedSection("hasLink") { $_scope_5 =>
          $_scope_5.renderVariable("nameWithHtml", true)
          $_scalate_$_context << ( " " )
        }
        $_scalate_$_context << ( "</div>\r\n  \r\n \r\n" )
        $_scope_2.section("children") { $_scope_6 =>
          $_scalate_$_context << ( "<div class=\"row text-left\">\r\n     <div class=\"col-sm-1\"> </div>\r\n    <div class=\"col-sm-11 text-left\">\r\n" )
          $_scope_6.section("imagePath") { $_scope_7 =>
            $_scalate_$_context << ( "<img src=\"../" )
            $_scope_7.renderVariable("imagePath", true)
            $_scalate_$_context << ( "\" />\r\n" )
          }
          $_scope_6.renderVariable("nameWithHtml", true)
          $_scalate_$_context << ( " </div>\r\n  </div>\r\n  \r\n" )
          $_scope_6.section("children") { $_scope_8 =>
            $_scalate_$_context << ( "<div class=\"row text-left\">\r\n     <div class=\"text-justify col-sm-2\"> </div>\r\n    <div class=\"col-sm-10 text-left\"  style=\"font-size : 16px\" >\r\n" )
            $_scope_8.section("imagePath") { $_scope_9 =>
              $_scalate_$_context << ( "<img src=\"../" )
              $_scope_9.renderVariable("imagePath", true)
              $_scalate_$_context << ( "\" width=\"16\" />\r\n " )
            }
            $_scope_8.renderVariable("nameWithHtml", true)
            $_scalate_$_context << ( " </div>\r\n  </div>\r\n  \r\n  \r\n  \r\n  \r\n\r\n" )
          }
        }
      }
      $_scalate_$_context << ( "</div>\r\n\r\n\r\n\r\n\r\n" )
      $_scope_1.partial("footer")
      $_scalate_$_context << ( "\r\n\r\n\r\n\r\n\r\n" )
    }
  }
}


class $_scalate_$htmlIssue_mustache extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$htmlIssue_mustache.$_scalate_$render(context)
}
