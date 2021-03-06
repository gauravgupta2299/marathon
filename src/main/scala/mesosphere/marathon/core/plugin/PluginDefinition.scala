package mesosphere.marathon
package core.plugin

import play.api.libs.json.JsObject

case class PluginDefinition(
  id: String,
  plugin: String,
  implementation: String,
  tags: Option[Set[String]],
  configuration: Option[JsObject],
  info: Option[JsObject],
  enabled: Option[Boolean])

case class PluginDefinitions(plugins: Seq[PluginDefinition])

object PluginDefinitions {
  lazy val None = PluginDefinitions(Seq.empty[PluginDefinition])
}
