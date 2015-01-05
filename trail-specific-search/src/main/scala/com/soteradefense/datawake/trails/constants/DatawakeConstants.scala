package com.soteradefense.datawake.trails.constants

object DatawakeConstants {
  var KAFKA_CRAWLER_BROKERS: String = "kafka.crawler.brokers"

  var SEARCH_ENDPOINT_ID: String = "search.api.key"

  val GOOGLE_KEY_ID: String = "google.search.key"
  val GOOGLE_CX_ID: String = "google.search.cx"
  val KAFKA_BROKERS_ID: String = "kafka.brokers.key"
  val BING_KEY_ID: String = "bing.search.key"
  val ZK_NODES_ID: String = "zk.nodes.key"

  val APP_ID: String = "trail-entities-search"
  val CRAWLER_TOPIC: String = "memex.crawled_" + APP_ID
  val TRAIL_SEARCH_TOPIC: String = "trail-search"
}