/**
 * Copyright 2011 Xeiam LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xeiam.sundial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xeiam.sundial.exceptions.JobInterruptException;

/**
 * @author timmolter
 */
public class SampleJob1 extends Job {

  private final Logger logger = LoggerFactory.getLogger(SampleJob1.class);

  @Override
  public void doRun() throws JobInterruptException {

    logger.info("RUNNING!");

    // Do something interesting...

    logger.info("DONE!");
  }
}
