package com.jimjh.merkle.spec

import org.scalatest._
import org.scalatest.concurrent.{Conductors, Eventually}
import org.scalatest.time.SpanSugar

abstract class UnitSpec
    extends FlatSpec
    with Matchers
    with Eventually
    with SpanSugar
    with Conductors
    with BeforeAndAfter