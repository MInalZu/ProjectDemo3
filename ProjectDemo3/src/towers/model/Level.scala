package towers.model

import towers.model.game_objects.GridLocation

object Level {

  def apply(number: Int): Level ={
    if(number == 0){
      new Level{
        maxBaseHealth = 1

        wallLocations = List(
          new GridLocation(0,17), new GridLocation(1,17), new GridLocation(1,18), new GridLocation(4,0),
          new GridLocation(5,1), new GridLocation(6,2), new GridLocation(7,3), new GridLocation(8,4),
          new GridLocation(8,5), new GridLocation(4,5), new GridLocation(5,5), new GridLocation(6,5),
          new GridLocation(7,5), new GridLocation(9,5), new GridLocation(10,5), new GridLocation(11,5),
          new GridLocation(12,5), new GridLocation(13,5), new GridLocation(6,5), new GridLocation(6,6),
          new GridLocation(6,7), new GridLocation(6,8), new GridLocation(6,9), new GridLocation(6,10),
          new GridLocation(6,11), new GridLocation(6,12), new GridLocation(6,13), new GridLocation(6,14),
          new GridLocation(8,12), new GridLocation(9,12), new GridLocation(10,12), new GridLocation(11,12),
          new GridLocation(12,12), new GridLocation(13,12), new GridLocation(14,12), new GridLocation(15,12),
          new GridLocation(13,11), new GridLocation(13,10), new GridLocation(13,9), new GridLocation(13,8),
          new GridLocation(13,6), new GridLocation(13,5), new GridLocation(13,4), new GridLocation(13,3),
          new GridLocation(11,13), new GridLocation(10,14), new GridLocation(9,15), new GridLocation(8,16),
          new GridLocation(7,17), new GridLocation(6,18), new GridLocation(13,9), new GridLocation(13,8),
          new GridLocation(13,6), new GridLocation(13,5), new GridLocation(13,4), new GridLocation(15,0),
          new GridLocation(15,1), new GridLocation(15,2), new GridLocation(15,3), new GridLocation(15,4),
          new GridLocation(16,4), new GridLocation(17,4), new GridLocation(18,4), new GridLocation(8,8),
          new GridLocation(8,9), new GridLocation(8,10), new GridLocation(9,8), new GridLocation(10,8),
          new GridLocation(10,9), new GridLocation(10,10), new GridLocation(9,10), new GridLocation(1,3)
        )

        startingLocation = new GridLocation(0, 0)
        base = new GridLocation(9, 9)
      }
    }else{
      new Level
    }
  }

}

class Level {

  var towerLocations:List[GridLocation] = List()
  var wallLocations:List[GridLocation] = List()

  var gridWidth: Int = 19
  var gridHeight: Int = 19

  var startingLocation = new GridLocation(0, 3)
  var base = new GridLocation(24, 3)

  var maxBaseHealth = 2

}
