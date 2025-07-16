package dev.luuuppi.remove_third_person.mixins;

import net.minecraft.client.GameSettings;
import net.minecraft.client.settings.PointOfView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameSettings.class)
public class OptionsMixin {
  @Inject(method = "setCameraType", at = @At("HEAD"), cancellable = true)
  private void disableManualPerspectiveChange(PointOfView pPointOfView, CallbackInfo ci) {
    ci.cancel();
  }
}
