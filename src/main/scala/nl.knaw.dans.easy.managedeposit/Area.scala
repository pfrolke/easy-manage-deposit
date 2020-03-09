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

object Area extends Enumeration {
  type Area = Value
  val SWORD_INBOX : Area = Value("sword2-inbox")
  val INGEST_FLOW_INBOX : Area = Value("ingest-flow-inbox")
  val DEPOSIT_DRAFTS : Area = Value("deposit-drafts")

  def toArea(areaName: String): Option[Area] = Area.values.find(_.toString == areaName)
}
