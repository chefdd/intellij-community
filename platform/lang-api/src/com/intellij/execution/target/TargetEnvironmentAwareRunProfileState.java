// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.execution.target;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.openapi.progress.ProgressIndicator;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Experimental
public interface TargetEnvironmentAwareRunProfileState extends RunProfileState {
  @NotNull
  TargetEnvironment prepareEnvironment(@NotNull ProgressIndicator progressIndicator) throws ExecutionException;
}