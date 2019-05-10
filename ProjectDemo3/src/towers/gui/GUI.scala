package towers.gui

import io.socket.client._
import play.api.libs.json._
import scalafx.application
import scalafx.application.JFXApp
import scalafx.scene.paint.Color._
import scalafx.scene.paint._
import scalafx.scene.shape._
import scalafx.scene._


object GUI extends JFXApp {


  stage = new application.JFXApp.PrimaryStage {
    title.value = "No Scala Please, No Server Pls!"
    scene = new Scene(1160, 600) {
      var socket: Socket = IO.socket("http://localhost:8080/")
      socket.connect()
      var gameState: JsValue = Json.obj()

      var graphics: Group = new Group {}
      val grid: Double = 30

      def parseGameState(event: String): Unit = {
        val parsed: JsValue = Json.parse(event)
        val gridSize: Map[String, JsValue] = (parsed \ "gridSize").as[Map[String, JsValue]]
        val player: List[JsValue] = (parsed \ "players").as[List[JsValue]]
      }


      def placeSquare(x: Double, y: Double, color: Paint): Unit = {
        val tile = new Rectangle
        tile.width = grid
        tile.height = grid
        tile.x = x * grid
        tile.y = y * grid
        tile.stroke = Black
        tile.fill = color
        graphics.children.add(tile)
        content = List(graphics)
      }

      def placeCircle(x: Double, y: Double, color: String, radius: Double): Unit = {
        val circle = new Circle
        circle.radius = radius
        circle.centerX = x
        circle.centerY = y
        graphics.children.add(circle)
        content = List(graphics)

      }


      def drawGameBoard(x: Double, y: Double): Unit = {
        placeSquare(x, y, White)
      }

      def drawWalls(x: Double, y: Double): Unit = {
        placeSquare(x, y, Gray)
        placeSquare(0,17, Gray)
        placeSquare(1,17, Gray)
        placeSquare(1,18, Gray)
        placeSquare(4,0, Gray)
        placeSquare(5,1, Gray)
        placeSquare(6,2, Gray)
        placeSquare(7,3, Gray)
        placeSquare(8,4, Gray)
        placeSquare(8,5, Gray)
        placeSquare(4,5, Gray)
        placeSquare(5,5, Gray)
        placeSquare(6,5, Gray)
        placeSquare(7,5, Gray)
        placeSquare(9,5, Gray)
        placeSquare(10,5, Gray)
        placeSquare(11,5, Gray)
        placeSquare(12,5, Gray)
        placeSquare(13,5, Gray)
        placeSquare(6,5, Gray)
        placeSquare(6,6, Gray)
        placeSquare(6,7, Gray)
        placeSquare(6,8, Gray)
        placeSquare(6,9, Gray)
        placeSquare(6,10, Gray)
        placeSquare(6,11, Gray)
        placeSquare(6,12, Gray)
        placeSquare(6,13, Gray)
        placeSquare(6,14, Gray)
        placeSquare(8,12, Gray)
        placeSquare(9,12, Gray)
        placeSquare(10,12, Gray)
        placeSquare(11,12, Gray)
        placeSquare(12,12, Gray)
        placeSquare(13,12, Gray)
        placeSquare(14,12, Gray)
        placeSquare(15,12, Gray)
        placeSquare(13,11, Gray)
        placeSquare(13,10, Gray)
        placeSquare(13,9, Gray)
        placeSquare(13,8, Gray)
        placeSquare(13,6, Gray)
        placeSquare(13,5, Gray)
        placeSquare(13,4, Gray)
        placeSquare(13,3, Gray)
        placeSquare(11,13, Gray)
        placeSquare(10,14, Gray)
        placeSquare(9,15, Gray)
        placeSquare(8,16, Gray)
        placeSquare(7,17, Gray)
        placeSquare(6,18, Gray)
        placeSquare(13,9, Gray)
        placeSquare(13,8, Gray)
        placeSquare(13,6, Gray)
        placeSquare(13,5, Gray)
        placeSquare(13,4, Gray)
        placeSquare(15,0, Gray)
        placeSquare(15,1, Gray)
        placeSquare(15,2, Gray)
        placeSquare(15,3, Gray)
        placeSquare(15,4, Gray)
        placeSquare(16,4, Gray)
        placeSquare(17,4, Gray)
        placeSquare(18,4, Gray)
        placeSquare(8,8, Gray)
        placeSquare(8,9, Gray)
        placeSquare(8,10, Gray)
        placeSquare(9,8, Gray)
        placeSquare(10,8, Gray)
        placeSquare(10,9, Gray)
        placeSquare(10,10, Gray)
        placeSquare(9,10, Gray)
        placeSquare(1,3, Gray)
      }

      for (i <- 0 to 18; j <- 0 to 18) {
        drawGameBoard(i, j)
      }
      drawWalls(1,1)

      def drawPlayer(x: Double, y: Double): Unit = {
        placeCircle(10,0,"Blue",2)
      }
      drawPlayer(1,1)

    }
  }
}