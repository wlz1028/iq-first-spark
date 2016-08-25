package ca.infoq.spark.tut

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

/**
  * Created by infoq.ca(Edward,Wang) on 2016-08-24.
  */
object SimpleApp extends App {
  // create Spark context with Spark configuration
  val sc = new SparkContext(new SparkConf().setAppName("IQ Simple Spark App").setMaster("local[*]"))
  val rdd = sc.parallelize(Seq(1,2,3,4,5))
  println(rdd.count())
}
