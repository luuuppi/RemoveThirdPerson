package dev.luuuppi.remove_third_person.mixins;

import net.minecraft.client.settings.PointOfView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PointOfView.class)
public class CameraMixin {
  @Inject(method = "cycle", at = @At("HEAD"), cancellable = true)
  private void disableViewCycle(CallbackInfoReturnable<PointOfView> cir) {
    cir.setReturnValue((PointOfView) (Object) this);
  }
}
