/**
 * Copyright (C) 2017 DANS - Data Archiving and Networked Services (info@dans.knaw.nl)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.knaw.dans.easy.managedeposit

import org.scalatest.OptionValues
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class StateSpec extends AnyFlatSpec with Matchers with OptionValues {

  "The toState method" should "give the proper state when called with an existing value" in {
    State.toState("ARCHIVED").value shouldBe State.ARCHIVED
    State.toState("DRAFT").value shouldBe State.DRAFT
    State.toState("FAILED").value shouldBe State.FAILED
    State.toState("INVALID").value shouldBe State.INVALID
    State.toState("REJECTED").value shouldBe State.REJECTED
    State.toState("SUBMITTED").value shouldBe State.SUBMITTED
    State.toState("UNKNOWN").value shouldBe State.UNKNOWN
    State.toState("NON-EXISITING") shouldBe None
  }

  it should "be case sensitive" in {
    State.toState("archived") shouldBe None
  }
}
