package za.co.mmagon.jwebswing.plugins.bootstraptagsinput;

import za.co.mmagon.jwebswing.base.html.InputTextType;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * Bootstrap-select is a jQuery plugin that utilizes Bootstrap's dropdown.js to style and bring additional functionality to standard select elements.
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Bootstrap Select", description = "Turn checkboxes    and radio buttons    into toggle switches  ",
        url = "https://github.com/GedMarc/JWebSwing-Bootstrap-Select")
public class BootstrapTagsInput extends InputTextType<BootstrapTagsInput>
{

    private static final long serialVersionUID = 1L;
    /**
     * The feature for this select
     */
    private BootstrapTagsInputFeature feature;

    /*
     * Constructs a new BootstrapTagsInput
     */
    public BootstrapTagsInput()
    {
        addFeature(getFeature());
    }

    /**
     * Returns the feature for this component
     *
     * @return
     */
    public BootstrapTagsInputFeature getFeature()
    {
        if (feature == null)
        {
            feature = new BootstrapTagsInputFeature(this);
        }
        return feature;
    }

    /**
     * Sets the feature for this bootstrap drop down
     *
     * @param feature
     */
    public void setFeature(BootstrapTagsInputFeature feature)
    {
        this.feature = feature;
    }

    @Override
    public BootstrapTagsInputOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
