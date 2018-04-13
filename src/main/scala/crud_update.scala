package akka_crud_restapi

case class TodoUpdate(title: Option[String], completed: Option[Boolean], order: Option[Int])
