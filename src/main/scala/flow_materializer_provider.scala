package akka_crud_restapi

import akka.stream._

trait FlowMaterializerProvider {
  implicit val materializer: Materializer
}
