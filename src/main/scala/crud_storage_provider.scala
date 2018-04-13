package akka_crud_restapi

import akka.actor._

trait TodoStorageProvider {
  val todoStorage: ActorRef
}
